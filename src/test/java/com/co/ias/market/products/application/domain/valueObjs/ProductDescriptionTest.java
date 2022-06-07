package com.co.ias.market.products.application.domain.valueObjs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductDescriptionTest {

    @Test
    @DisplayName("Null product description should throw an error")
    void null_product_description() {
        // AAA - arrange act assert
        String invalidDescription = null;

        assertThrows(NullPointerException.class, () -> {
            new ProductDescription(invalidDescription);
        });
    }

    @Test
    @DisplayName("A name with length greater than 40 characters should throw an error")
    void invalid_product_description() {
        // AAA - arrange act assert
        String invalidDescription = "This text id greater than 40 characters because i need to test it";

        assertThrows(IllegalArgumentException.class, () -> {
            new ProductDescription(invalidDescription);
        });
    }

}
