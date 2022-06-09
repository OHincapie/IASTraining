package com.co.ias.market.categories.application.domain.valueObjs;

import org.apache.commons.lang3.Validate;

public class AvailableCategory {
    private final Integer value;

    public AvailableCategory(Integer value) {
        Validate.notNull(value, "The availability of the category can not be bull");
        Validate.isTrue(value == 1 || value == 0 && value.toString().length() == 1, "The availability of the category can not be different to 0 or 1");
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "AvailableCategory{" +
                "value=" + value +
                '}';
    }
}
