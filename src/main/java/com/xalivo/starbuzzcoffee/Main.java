package com.xalivo.starbuzzcoffee;

import com.xalivo.starbuzzcoffee.decorators.Discount;
import com.xalivo.starbuzzcoffee.decorators.Mocha;
import com.xalivo.starbuzzcoffee.decorators.Soy;
import com.xalivo.starbuzzcoffee.decorators.Whip;
import com.xalivo.starbuzzcoffee.pojos.Beverage;
import com.xalivo.starbuzzcoffee.pojos.DarkRoast;
import com.xalivo.starbuzzcoffee.pojos.Espresso;


public class Main {

    public static void printBeverage(Beverage beverage) {
        System.out.printf("%s: %.2f €\n", beverage.getDescription(), beverage.cost());
    }

    public static void main(String[] args) {
        // Espresso with Soy
        Beverage beverage = new Espresso();
        beverage = new Soy(beverage);
        printBeverage(beverage);
        // Dark Roast with Mocha & Whip

        // Espresso with Mocha, Whip, Soy & 10% off

    }
}
