package com.co.ias.market.categories.application.domain;

import com.co.ias.market.categories.application.domain.valueObjs.AvailableCategory;
import com.co.ias.market.categories.application.domain.valueObjs.CategoryId;
import com.co.ias.market.categories.application.domain.valueObjs.CategoryName;
import com.co.ias.market.categories.application.domain.valueObjs.QuantityProducts;

public class Category {
    private final CategoryId id;
    private final CategoryName name;
    private final QuantityProducts quantityProducts;
    private final AvailableCategory available;

    public Category(CategoryId id, CategoryName name, QuantityProducts quantityProducts, AvailableCategory available) {
        this.id = id;
        this.name = name;
        this.quantityProducts = quantityProducts;
        this.available = available;
    }

    public CategoryId getId() {
        return id;
    }

    public CategoryName getName() {
        return name;
    }

    public QuantityProducts getQuantityProducts() {
        return quantityProducts;
    }

    public AvailableCategory getAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name=" + name +
                ", quantityProducts=" + quantityProducts +
                ", available=" + available +
                '}';
    }
}
