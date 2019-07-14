package com.stackroute;

public class Hamburger {

    int lettucePrice = 40;
    int tomatoPrice = 30;
    int carrotPrice = 50;
    int capsicumPrice = 30;
    private int lettuceAddOns;
    private int carrotAddOns;
    private int tomatoAddOns;
    private int capsicumAddOns;

    public int getLettucePrice() {
        return lettucePrice;
    }

    public int getTomatoPrice() {
        return tomatoPrice;
    }

    public int getCarrotPrice() {
        return carrotPrice;
    }

    public int getCapsicumPrice() {
        return capsicumPrice;
    }


    public void lettuceAddOns() {
      this.lettuceAddOns++;
    }

    public void carrotAddOns() {
        this.carrotAddOns++;
    }

    public void capsicumAddOns() {
        this.capsicumAddOns++;
    }

    public void tomatoAddOns() {
        this.tomatoAddOns++;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }


    private  String rollType;
    private String meat;
    private int price;

    public Hamburger(String rollType, String meat, int price) {
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
    }

    public int getHamburgerPrice()
    {
        int price=this.price;
        if (lettuceAddOns != 0) {
            price +=  getLettucePrice();
            System.out.println("LettuceAddOnPrice:"+lettucePrice);
        }
        if (tomatoAddOns != 0) {
            price +=  getTomatoPrice();
            System.out.println("TomatoAddOnPrice:"+tomatoPrice);
        }
        if (capsicumAddOns != 0) {
            price +=  getCapsicumPrice();
            System.out.println("CapsiucumAddOnPrice:"+capsicumPrice);
        }
        if (carrotAddOns != 0) {
            price += getCarrotPrice();
            System.out.println("CarrotAddOnPrice:"+carrotPrice);
        }
        System.out.println("BaseHamburger price:"+this.price);
        return price;
    }


}
