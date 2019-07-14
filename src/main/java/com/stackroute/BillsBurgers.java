package com.stackroute;

import java.util.*;

import static java.lang.System.exit;

public class BillsBurgers {

    public static void main(String[] args) {

        System.out.println("---------------Welcome to BillsBurger------------------");
        System.out.println("Select any one type of burger:");
        System.out.println(" 1:Base Burger \n 2:Healthy Burger \n 3:DeluxeBurger");
        Scanner scanner = new Scanner(System.in);
        int burgerType = scanner.nextInt();
        switch (burgerType) {
            case 1:
                Hamburger hamburger = new Hamburger("wheatbread", "mutton", 150);
                System.out.println("1:Lettuce" +"\n" +
                        "2:Carrot"  + "\n" +
                        "3:Tomato"    + "\n" +
                        "4:Capsicum" + "\n" );
                System.out.println("Enter number of additions");
                int numberOfAddOns = scanner.nextInt();
                System.out.println("enter the index number of the addon to choose:");
                for (int i = 0; i < numberOfAddOns; i++) {
                    int addons = scanner.nextInt();
                    switch (addons) {
                        case 1:
                            hamburger.lettuceAddOns();
                            break;
                        case 2:
                            hamburger.carrotAddOns();
                            break;
                        case 3:
                            hamburger.tomatoAddOns();
                            break;
                        case 4:
                            hamburger.capsicumAddOns();
                            break;
                        default:
                            exit(0);
                    }
                }
                System.out.println("The Bread roll type is: " +hamburger.getRollType() + " meat is: " +hamburger.getMeat());
                System.out.println("The price of BaseHamburger is:" +hamburger.getHamburgerPrice());
                break;
            case 2:
                HealthyHamburger healthyBurger = new HealthyHamburger(" brown rye bread roll", "chicken", 150);
                System.out.println("1:Lettuce" +"\n" +
                                   "2:Carrot"  + "\n" +
                                   "3:Tomato"    + "\n" +
                                   "4:Capsicum" + "\n" +
                                   "5:Avocado" + "\n" +
                                   "6:Jalapenos");
                System.out.println("Enter 0 if no add ons required... ");
                System.out.println("Enter number of additions");
                int numberOfAddOns1 = scanner.nextInt();
                System.out.println("enter the index number of the addon to choose:");
                for (int i = 0; i < numberOfAddOns1; i++) {
                    int addons = scanner.nextInt();
                    switch (addons) {
                        case 1:
                            healthyBurger.lettuceAddOns();
                            break;
                        case 2:
                            healthyBurger.carrotAddOns();
                            break;
                        case 3:
                            healthyBurger.tomatoAddOns();
                            break;
                        case 4:
                            healthyBurger.capsicumAddOns();
                            break;
                        case 5:
                            healthyBurger.avocadoAddOns();
                            break;
                        case 6:
                            healthyBurger.jalapenosAddOns();
                            break;
                        default:
                            exit(0);
                    }
                }
                System.out.println("Price Of Healthy Burger with AddOns: " + healthyBurger.priceHealthBurger());
                break;
            case 3:
                DeluxHamburger deluxeBurger = new DeluxHamburger("bun", "chicken", 150, 50, 60);
                System.out.println("Price of coke is: " +deluxeBurger.getCokePrice() +"\nPrice of chips is: " +deluxeBurger.getChipsPrice());
                System.out.println("Price of HamBurger along with coke and chips:" + deluxeBurger.priceOfDeluxeBurger());
            default:
                exit(0);
        }
    }


}
