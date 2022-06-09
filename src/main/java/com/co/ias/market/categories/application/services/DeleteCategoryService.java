package com.co.ias.market.categories.application.services;

import com.co.ias.market.categories.application.domain.valueObjs.CategoryId;
import com.co.ias.market.categories.application.ports.input.DeleteCategoryUseCase;
import com.co.ias.market.categories.application.ports.output.CategoryRepository;
import com.co.ias.market.infranstructure.models.CategoryDTO;
import org.springframework.stereotype.Service;

@Service
public class DeleteCategoryService implements DeleteCategoryUseCase {
    private final CategoryRepository categoryRepository;

    public DeleteCategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategoryDTO execute(CategoryDTO categoryDTO) {
        categoryRepository.delete(new CategoryId(categoryDTO.getId()));
        return null;
    }
}
