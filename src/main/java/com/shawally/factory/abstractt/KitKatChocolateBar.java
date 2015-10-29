
package com.shawally.factory.abstractt;

/**
 * <p>
 * A simple representation of a KitKat chocolate bar.
 * </p>
 * @author Sabry <Shawally.Sabry@gmail.com>
 */
public class KitKatChocolateBar implements ChocolateBar {

    @Override
    public String color() {
        return "White";
    }

    @Override
    public int weightInGrams() {
        return 25;
    }
}
