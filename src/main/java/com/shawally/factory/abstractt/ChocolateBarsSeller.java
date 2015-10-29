
package com.shawally.factory.abstractt;

/**
 * <p>
 * A chocolate seller is a guy who sells chocolate based on customer's requirement.
 * </p>
 * @author Sabry <Shawally.Sabry@gmail.com>
 */
public class ChocolateBarsSeller {
    
    /**
     * <p>
     * Returns the chocolate bar based on the brand that the customer wants.
     * </p>
     */
    public ChocolateBar sellChocolateBar(final String customerBrandNeeds) {
        final ChocolateBrand brand
                = getChocolateBarBrand(customerBrandNeeds);
        
        if (brand == null) {
            return null;
        }
        
        return brand.getChocolateBar();
    }
    
    /**
     * <p>
     * Returns the chocolate brand that the customer wants.
     * </p>
     */
    private ChocolateBrand getChocolateBarBrand(final String customerBrandNeeds) {
        if ("Cadbury".equalsIgnoreCase(customerBrandNeeds)) {
            return new CadburyChocolateBrand();
        } else if ("KitKat".equalsIgnoreCase(customerBrandNeeds)) {
            return new KitKatChocolateBrand();
        } 
        
        return null;
    }
}
