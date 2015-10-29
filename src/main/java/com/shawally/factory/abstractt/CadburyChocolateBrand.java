
package com.shawally.factory.abstractt;

/**
 * <p>
 * A Cadbury chocolate factory.
 * </p>
 * @author Sabry <Shawally.Sabry@gmail.com>
 */
public class CadburyChocolateBrand implements ChocolateBrand {

    @Override
    public ChocolateBar getChocolateBar() {
        return new CadburyChocolateBar();
    }
}
