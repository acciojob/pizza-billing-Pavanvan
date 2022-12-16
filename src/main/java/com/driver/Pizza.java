package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheesePrice;
    private int extraToppingPrice;

    private int takeAwayPrice;

    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isTakeAwayAdded;

    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here

        this.isCheeseAdded = false;
        this.isToppingAdded = false;
        this.isTakeAwayAdded = false;
        this.extraCheesePrice = 80;
        this.takeAwayPrice = 20;

        if(isVeg){
            this.price = 300;
            this.extraToppingPrice = 70;
        } else {
            this.price = 400;
            this.extraToppingPrice = 120;
        }
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.isCheeseAdded){
            this.price = this.price + this.extraCheesePrice;
            this.isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.isToppingAdded){
            this.price = this.price + this.extraToppingPrice;
            this.isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!this.isTakeAwayAdded){
            this.price = this.price + this.takeAwayPrice;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!this.isBillGenerated){
            isBillGenerated = true;

            if(this.isCheeseAdded){
                this.bill = this.bill + "Extra Cheese Added: " + this.extraCheesePrice + "\n";
            }
            if(this.isToppingAdded){
                this.bill = this.bill + "Extra Toppings Added: " + this.extraToppingPrice + "\n";
            }
            if (this.isTakeAwayAdded == true) {
                this.bill = this.bill + "Paperbag Added: " + this.takeAwayPrice + "\n";
            }
            this.bill = this.bill + "Total Price: "+ this.price + "\n";
        }
        return this.bill;
    }
}