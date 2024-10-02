package org.example.models;

import org.example.mobile.Contact;

import java.util.*;

public class Grocery {
    public static ArrayList<String> groceryList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void startGrocery(){
        int choice;
        do{
            System.out.println("Yapılmak istenen operasyonu seçiniz. 0 = çıkış, 1 = ekleme, 2 = çıkarma");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                    String itemsToAdd = scanner.nextLine();
                    addItems(itemsToAdd);
                    printSorted();
                    break;
                case 2:
                    System.out.println("Çıkarılmasını istediğiniz elemanları giriniz.");
                    String itemsToRemove = scanner.nextLine();
                    removeItems(itemsToRemove);
                    printSorted();
                    break;
            }
        } while(choice != 0);
            scanner.close();
    }

    public static void addItems(String input){
        String[] splitedItems = input.split(",");
        for(String item : splitedItems){
            item = item.trim();
            if(checkItemIsInList(item)){
                System.out.println("Girilen item listede mevcut");
            } else {
                groceryList.add(item);
                printSorted();
            }
        }

    }
    public static void removeItems(String input){
        String[] splitItems = input.split(",");
        for(String item : splitItems){
            item = item.trim();
            if(!checkItemIsInList(item)){
                System.out.println("Girilen item listede mevcut değil");
            } else {
                groceryList.remove(item);
                printSorted();
            }
        }

    }
    public static boolean checkItemIsInList(String product){
        return groceryList.contains(product);
    }
    public static void printSorted(){
        sortItems();
        System.out.println("Mevcut pazar listesi");
        for(String item : groceryList){
            System.out.println(item);
        }
    }

    public static void sortItems(){
        Collections.sort(groceryList);
    }
}
