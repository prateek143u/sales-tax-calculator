package com.yourbusinessassistant;

public class Item {

    private String itemName;
    private float itemPrice;
    private int quantity = 1;
    private boolean isTaxable = true;
    private boolean isImported = false;

    public Item() {
    }

    public Item(String itemName, float itemPrice, int quantity, boolean isTaxable) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
        this.isTaxable = isTaxable;

        if(itemName.contains("imported") || itemName.contains("Imported")){
            isImported = true;
        }
    }

    public Item(String itemName, float itemPrice, boolean isTaxable) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.isTaxable = isTaxable;

        if(itemName.contains("imported") || itemName.contains("Imported")){
            isImported = true;
        }
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public boolean isTaxable() {
        return isTaxable;
    }

    public void setTaxable(boolean taxable) {
        isTaxable = taxable;
    }

    public boolean isImported() {
        return isImported;
    }

    public void setImported(boolean imported) {
        isImported = imported;
    }

    public float getAmount(){
        return itemPrice * quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", quantity=" + quantity +
                ", isTaxable=" + isTaxable +
                ", isImported=" + isImported +
                '}';
    }
}