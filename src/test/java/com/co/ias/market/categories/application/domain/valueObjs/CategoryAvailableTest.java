package com.co.ias.market.categories.application.domain.valueObjs;

import com.co.ias.market.products.application.domain.valueObjs.ProductDescription;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CategoryAvailableTest {

    @Test
    @DisplayName("Null category availability should throw an error")
    void null_category_availability() {
        // AAA - arrange act assert
        Boolean invalidAvailable = null;

        assertThrows(NullPointerException.class, () -> {
            new AvailableCategory(invalidAvailable);
        });
    }


}
