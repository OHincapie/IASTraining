package com.co.ias.market.categories.application.domain.valueObjs;

import org.apache.commons.lang3.Validate;

public class AvailableCategory {
    private final boolean value;

    public AvailableCategory(boolean value) {
        Validate.notNull(value, "The availability of the category can not be bull");
        this.value = value;
    }

    public boolean isValue() {
        return value;
    }

    @Override
    public String toString() {
        return "AvailableCategory{" +
                "value=" + value +
                '}';
    }
}
