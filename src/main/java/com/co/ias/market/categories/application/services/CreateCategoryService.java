package com.co.ias.market.categories.application.services;

import com.co.ias.market.categories.application.domain.Category;
import com.co.ias.market.categories.application.domain.valueObjs.AvailableCategory;
import com.co.ias.market.categories.application.domain.valueObjs.CategoryName;
import com.co.ias.market.categories.application.domain.valueObjs.QuantityProducts;
import com.co.ias.market.categories.application.ports.input.CreateCategoryUseCase;
import com.co.ias.market.categories.application.ports.output.CategoryRepository;
import com.co.ias.market.infranstructure.models.CategoryDTO;
import org.springframework.stereotype.Service;

@Service
public class CreateCategoryService implements CreateCategoryUseCase {

    private final CategoryRepository categoryRepository;

    public CreateCategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategoryDTO execute(CategoryDTO categoryDTO) {
        Category category = new Category(
                null,
                new CategoryName(categoryDTO.getName()),
                new QuantityProducts(categoryDTO.getQuantity()),
                new AvailableCategory(categoryDTO.getAvailable())
                );
        categoryRepository.store(category);
        return categoryDTO;
    }
}
