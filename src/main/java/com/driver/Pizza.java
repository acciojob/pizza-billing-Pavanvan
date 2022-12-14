package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheesePrice;
    private int toppingsPrice;
    private int takeAwayPrice;
    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;


    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.cheesePrice = 80;
        this.takeAwayPrice = 20;
        if (isVeg == true) {
            this.price = 20;
            this.takeAwayPrice = 20;

        } else {
            this.price = 400;
            this.toppingsPrice = 120;
        }
        this.isTakeAwayAdded = false;
        this.isToppingsAdded = false;
        this.isCheeseAdded = false;
        this.bill = "Base Price of the Pizza" + this.price + "\n";
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        if (isCheeseAdded == false) {
            this.price = this.price + this.cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        if (isToppingsAdded == false) {
            this.price = this.price + this.toppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway() {
        if (isTakeAwayAdded == false) {
            this.price = this.price + this.takeAwayPrice;
            isTakeAwayAdded = true;
        }
    }

    public String getBill() {
        if (isBillGenerated == false) {


        } if (isCheeseAdded == true) {
                this.bill = this.bill + "Extra Cheese Added: " + this.cheesePrice + "\n";
            }
            if (isToppingsAdded == true) {
                this.bill = this.bill + "Extra Toppings Added:" + this.toppingsPrice + "\n";
            }
            if (isTakeAwayAdded == true) {
                this.bill = this.bill + "Paperbag Added:" + this.takeAwayPrice + "\n";
            }
            this.bill = this.bill + "Total Price: " + this.price + "\n";
            isBillGenerated = true;
            return this.bill;
        }
    }
