package com.stackroute;

public class HealthyHamburger extends Hamburger {

    public HealthyHamburger(String rollType, String meat, int price) {
        super(rollType, meat, price);
    }



    private int avocadoPrice = 78;
    private int jalapenosPrice = 90;
    private int avocado;
    private int jalapenos;
    private int lettuce;
    private int carrot;
    private int tomato;
    private int capsicum;

    public void lettuceAddOns() { this.lettuce++; }

    public void carrotAddOns() {
        this.carrot++;
    }

    public void capsicumAddOns() {
        this.capsicum++;
    }

    public void tomatoAddOns() {
        this.tomato++;
    }

    public void avocadoAddOns() { this.avocado++; }

    public void jalapenosAddOns() { this.jalapenos++; }


    public int priceHealthBurger() {
        int price = getHamburgerPrice();
        if (lettuce != 0) {
            price +=  getLettucePrice();
            System.out.println("LettuceAddOnPrice:"+getLettucePrice());
        }
         if (tomato != 0) {
            price +=  getTomatoPrice();
            System.out.println("TomatoAddOnPrice:"+getTomatoPrice());
        }
        if (capsicum != 0) {
            price +=  getCapsicumPrice();
            System.out.println("CapsiucumAddOnPrice:"+getCapsicumPrice());
        }
        if (carrot != 0) {
            price += getCarrotPrice();
              System.out.println("CarrotAddOnPrice:"+getCarrotPrice());
        }
       if (avocado != 0) {
            price += avocadoPrice;
            System.out.println("AvacadoAddOnPrice:"+avocadoPrice);
        }
        if (jalapenos != 0) {
            price +=  jalapenosPrice;
            System.out.println("MustardAddOnPrice:"+jalapenosPrice);
        }
        return price;
    }
}
