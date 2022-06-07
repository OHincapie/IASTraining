package com.co.ias.market.products.application.domain.valueObjs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductNameTest {
    @Test
    @DisplayName("Null product name should throw an error")
    void null_product_name() {
        // AAA - arrange act assert
        String invalidName = null;

        assertThrows(NullPointerException.class, () -> {
            new ProductName(invalidName);
        });
    }

    @Test
    @DisplayName("A name with length greater than 20 characters should throw an error")
    void invalid_product_name() {
        // AAA - arrange act assert
        String invalidName = "This text id greater tha 20 characters because yes";

        assertThrows(IllegalArgumentException.class, () -> {
            new ProductName(invalidName);
        });
    }
}
