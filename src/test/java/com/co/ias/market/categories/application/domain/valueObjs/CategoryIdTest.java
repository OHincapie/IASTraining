package com.co.ias.market.categories.application.domain.valueObjs;

import com.co.ias.market.products.application.domain.valueObjs.ProductDescription;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CategoryIdTest {

    @Test
    @DisplayName("Null category id should throw an error")
    void null_category_id() {
        // AAA - arrange act assert
        Long invalidId = null;

        assertThrows(NullPointerException.class, () -> {
            new CategoryId(invalidId);
        });
    }
}
