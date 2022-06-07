package com.co.ias.market.categories.application.domain.valueObjs;

import org.apache.commons.lang3.Validate;

public class CategoryId {
    private final Long value;

    public CategoryId(Long value) {
        Validate.notNull(value, "Category id can not be null");
        this.value = value;
    }

    public Long getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
