
package com.shawally.factory.abstractt;

import junit.framework.Assert;
import org.junit.Test;

/**
 * <p>
 * Main runner for the abstract factory.
 * </p>
 * @author Sabry <Shawally.Sabry@gmail.com>
 */
public class ChocolateBrandFactoryTest {
    
    @Test
    public void test() {
        final String userRequest = "Cadbury";
        
        final ChocolateBarsSeller seller = new ChocolateBarsSeller();
        final ChocolateBar bar
                = seller.sellChocolateBar(userRequest);
        
        Assert.assertTrue(bar instanceof CadburyChocolateBar);        
    }
}
