package com.stackroute;

public class DeluxHamburger extends Hamburger {
    public int getChipsPrice() {
        return chipsPrice;
    }

    public int getCokePrice() {
        return cokePrice;
    }

    private int chipsPrice;
    private int cokePrice;

    public DeluxHamburger(String rollType, String meat, int price,int chipsPrice, int cokePrice) {
        super(rollType,meat,price);
        this.chipsPrice=chipsPrice;
        this.cokePrice=cokePrice;
    }
    public int priceOfDeluxeBurger()
    {
        int price=getHamburgerPrice()+chipsPrice+cokePrice;
        return price;
    }
}
