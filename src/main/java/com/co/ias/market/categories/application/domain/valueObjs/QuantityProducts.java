package com.co.ias.market.categories.application.domain.valueObjs;

import org.apache.commons.lang3.Validate;

public class QuantityProducts {
    private final Integer value;

    public QuantityProducts(Integer value) {
        Validate.notNull(value, "The product's quantity can not be null");
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
