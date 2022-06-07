package com.co.ias.market.products.application.domain.valueObjs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductIdTest {

    @Test
    @DisplayName("Null product id should throw an error")
    void null_product_id() {
        // AAA - arrange act assert
        Long invalidId = null;

        assertThrows(NullPointerException.class, () -> {
            new ProductId(invalidId);
        });
    }
}
