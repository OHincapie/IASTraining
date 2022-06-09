package com.co.ias.market.infranstructure.models;

import com.co.ias.market.categories.application.domain.Category;
import com.co.ias.market.categories.application.domain.valueObjs.AvailableCategory;
import com.co.ias.market.categories.application.domain.valueObjs.CategoryId;
import com.co.ias.market.categories.application.domain.valueObjs.CategoryName;
import com.co.ias.market.categories.application.domain.valueObjs.QuantityProducts;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryDAO {
    private Long id;
    private String name;
    private Integer quantity;
    private Integer available;

    public CategoryDAO(Long id, String name, Integer quantity, Integer available) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.available = available;
    }

    public CategoryDAO() {
    }

    public Category toDomain() {
        return new Category(
                new CategoryId(id),
                new CategoryName(name),
                new QuantityProducts(quantity),
                new AvailableCategory(available)
        );
    }

    public CategoryDAO fromResultSet(ResultSet resultSet) throws SQLException{
        CategoryDAO categoryDAO = new CategoryDAO();
        categoryDAO.setId(resultSet.getLong("id"));
        categoryDAO.setName(resultSet.getString("name"));
        categoryDAO.setQuantity(resultSet.getInt("quantity"));
        categoryDAO.setAvailable(resultSet.getInt("available"));
        return categoryDAO;
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
        return "CategoryDAO{" +
                "categoryId=" + id +
                ", categoryName='" + name + '\'' +
                ", categoryQuantityProducts=" + quantity +
                ", isAvailable=" + available +
                '}';
    }

}
