
package com.shawally.factory.abstractt;

/**
 * <p>
 * A KitKat chocolate factory.
 * </p>
 * @author Sabry <Shawally.Sabry@gmail.com>
 */
public class KitKatChocolateBrand implements ChocolateBrand {

    @Override
    public ChocolateBar getChocolateBar() {
        return new KitKatChocolateBar();
    }
    
}
