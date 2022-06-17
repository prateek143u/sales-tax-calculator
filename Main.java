package com.yourbusinessassistant;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        SalesTaxReceiptGenerator salesTaxReceiptGenerator = new SalesTaxReceiptGenerator();
        salesTaxReceiptGenerator.setItemArrayList(getInputList1());
        salesTaxReceiptGenerator.printReceipt();
        salesTaxReceiptGenerator.setItemArrayList(getInputList2());
        salesTaxReceiptGenerator.printReceipt();
        salesTaxReceiptGenerator.setItemArrayList(getInputList3());
        salesTaxReceiptGenerator.printReceipt();
    }

    public static ArrayList<Item> getInputList1(){
        ArrayList<Item> itemArrayList = new ArrayList<>();
        itemArrayList.add(new Item(
                "Book",
                12.49f,
                false
        ));
        itemArrayList.add(new Item(
                "Music CD",
                14.99f,
                true
        ));
        itemArrayList.add(new Item(
                "Chocolate Bar",
                0.85f,
                false
        ));
        return itemArrayList;
    }

    public static ArrayList<Item> getInputList2(){
        ArrayList<Item> itemArrayList = new ArrayList<>();
        itemArrayList.add(new Item(
                "Imported Chocolate",
                10.00f,
                false
        ));
        itemArrayList.add(new Item(
                "Imported Perfume",
                47.50f,
                true
        ));
        return itemArrayList;
    }

    public static ArrayList<Item> getInputList3(){
        ArrayList<Item> itemArrayList = new ArrayList<>();
        itemArrayList.add(new Item(
                "Imported Perfume",
                27.99f,
                true
        ));
        itemArrayList.add(new Item(
                "Perfume",
                18.99f,
                true
        ));
        itemArrayList.add(new Item(
                "Headache pills",
                9.75f,
                false
        ));
        itemArrayList.add(new Item(
                "Imported chocolates",
                11.25f,
                false
        ));
        return itemArrayList;
    }

}