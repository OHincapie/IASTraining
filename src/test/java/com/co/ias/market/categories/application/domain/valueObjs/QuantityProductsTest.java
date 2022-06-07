package com.co.ias.market.categories.application.domain.valueObjs;

import com.co.ias.market.products.application.domain.valueObjs.ProductDescription;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class QuantityProductsTest {

    @Test
    @DisplayName("Null product's quantity of a category should throw an error")
    void null_product_quantity() {
        // AAA - arrange act assert
        Integer invalidQuantity = null;
        assertThrows(NullPointerException.class, () -> {
            new QuantityProducts(invalidQuantity);
        });
    }

}
