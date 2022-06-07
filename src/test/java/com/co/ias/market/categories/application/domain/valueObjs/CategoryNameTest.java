package com.co.ias.market.categories.application.domain.valueObjs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CategoryNameTest {

    @Test
    @DisplayName("Null category name should throw an error")
    void null_category_name() {
        // AAA - arrange act assert
        String invalidName = null;

        assertThrows(NullPointerException.class, () -> {
            new CategoryName(invalidName);
        });
    }

    @Test
    @DisplayName("Valid category name should not throw an error")
    void valid_category_name() {
        // AAA - arrange act assert
        String validName = "Tech";

        assertDoesNotThrow(() -> {
            new CategoryName(validName);
        });
    }
}
