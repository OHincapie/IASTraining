package com.co.ias.market.categories.application.domain.valueObjs;

import org.apache.commons.lang3.Validate;

public class CategoryName {
    private final String value;

    public CategoryName(String value) {
        Validate.notNull(value, "Category name can not be null");
        Validate.isTrue(value.length() <= 20, "Category name can not be longer than 20 characters");
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public String getValue() {
        return value;
    }
}
