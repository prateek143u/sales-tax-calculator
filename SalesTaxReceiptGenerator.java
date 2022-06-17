package com.yourbusinessassistant;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class SalesTaxReceiptGenerator {

    private static final float SALES_TAX_PERCENTAGE = 10;
    private static final float IMPORT_DUTY_PERCENTAGE = 5;

    private final DecimalFormat decimalFormat = new DecimalFormat("0.00");

    private ArrayList<Item> itemArrayList;

    public SalesTaxReceiptGenerator() {
        itemArrayList = new ArrayList<>();
    }

    public void printReceipt(){
        int itemListSize = itemArrayList.size();
        float amountTotal = 0.0f;
        float totalSalesTax = calculateTotalTax();
        System.out.println("--------- Tax Receipt ---------- \n");
        for(int i = 0;i < itemListSize;i++){
            Item currentItem = itemArrayList.get(i);
            float itemAmount = currentItem.getAmount();
            amountTotal += itemAmount;
            System.out.println((i+1) + ". " + currentItem.getItemName() + " X " + currentItem.getQuantity() + ": $" + decimalFormat.format(itemAmount + getSalesTaxOnItem(currentItem) + getImportDutyOnItem(currentItem)));
        }
        System.out.println("\n--------------------------------");
        System.out.println("Pre-Tax Amount: $" + decimalFormat.format(amountTotal));
        amountTotal += totalSalesTax;
        System.out.println("Sales Tax: $" + decimalFormat.format(totalSalesTax));
        System.out.println("Amount: $" + decimalFormat.format(amountTotal));
        System.out.println("--------------------------------");
    }

    public void setItemArrayList(ArrayList<Item> itemArrayList) {
        this.itemArrayList = itemArrayList;
    }

    private float calculateTotalTax(){
        float tax = 0.0f;
        for (Item item : itemArrayList) {
            tax += getTotalTaxOnItem(item);
        }
        return tax;
    }

    private float getTotalTaxOnItem(Item item){
        return getSalesTaxOnItem(item) + getImportDutyOnItem(item);
    }

    private float getSalesTaxOnItem(Item item){
        float itemAmount = item.getAmount();
        float tax = 0.0f;
        if(!item.isTaxable()){
            return tax;
        }
        tax = itemAmount * (SALES_TAX_PERCENTAGE/100);
        return tax;
    }

    private float getImportDutyOnItem(Item item){
        float itemAmount = item.getAmount();
        float tax = 0.0f;
        if(!item.isImported()){
            return tax;
        }
        tax = itemAmount * (IMPORT_DUTY_PERCENTAGE/100);
        return tax;
    }
}