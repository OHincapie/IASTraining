package com.co.ias.market.infranstructure.models;

import com.co.ias.market.categories.application.domain.Category;
import com.co.ias.market.categories.application.domain.valueObjs.AvailableCategory;
import com.co.ias.market.categories.application.domain.valueObjs.CategoryId;
import com.co.ias.market.categories.application.domain.valueObjs.CategoryName;
import com.co.ias.market.categories.application.domain.valueObjs.QuantityProducts;

public class CategoryDTO {

    private Long id;
    private String name;
    private Integer quantity;
    private Integer available;

    public CategoryDTO(Long id, String name, Integer quantity, Integer available) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.available = available;
    }

    public CategoryDTO() {
    }

    public Category toDomain() {
        return new Category(
                new CategoryId(id),
                new CategoryName(name),
                new QuantityProducts(quantity),
                new AvailableCategory(available)
        );
    }

    public CategoryDTO fromDomain(Category category) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId().getValue());
        categoryDTO.setName(category.getName().getValue());
        categoryDTO.setQuantity(category.getQuantityProducts().getValue());
        categoryDTO.setAvailable(category.getAvailable().getValue());
        return categoryDTO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "categoryId=" + id +
                ", categoryName='" + name + '\'' +
                ", categoryQuantityProducts=" + quantity +
                ", isAvailable=" + available +
                '}';
    }
}
