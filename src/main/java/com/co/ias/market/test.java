package com.co.ias.market;

import com.co.ias.market.categories.application.domain.Category;
import com.co.ias.market.categories.application.domain.valueObjs.AvailableCategory;
import com.co.ias.market.categories.application.domain.valueObjs.CategoryId;
import com.co.ias.market.categories.application.domain.valueObjs.CategoryName;
import com.co.ias.market.categories.application.domain.valueObjs.QuantityProducts;
import com.co.ias.market.products.application.domain.*;
import com.co.ias.market.products.application.domain.valueObjs.ProductDescription;
import com.co.ias.market.products.application.domain.valueObjs.ProductId;
import com.co.ias.market.products.application.domain.valueObjs.ProductName;
import com.co.ias.market.products.application.domain.valueObjs.ProductPrice;

public class test {
    public static void main(String[] args) {
        try {
            Product product = new Product(
                    new ProductId(1L),
                    new ProductName("Headphones"),
                    new ProductPrice(10),
                    new ProductDescription("Description") );
            System.out.println(product.toString());

        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Category category = new Category(
                    new CategoryId(1L),
                    new CategoryName("Tech"),
                    new QuantityProducts(60),
                    new AvailableCategory(true)
            );
            System.out.println(category.toString());
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
