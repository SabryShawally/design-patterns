
package com.shawally.factory.abstractt;

/**
 * <p>
 * A simple representation of dark chocolate.
 * </p>
 * @author Sabry <Shawally.Sabry@gmail.com>
 */
public class CadburyChocolateBar implements ChocolateBar {

    @Override
    public String color() {
        return "Black";
    }

    @Override
    public int weightInGrams() {
        return 20;
    }
}
