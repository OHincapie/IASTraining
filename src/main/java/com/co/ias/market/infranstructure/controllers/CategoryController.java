package com.co.ias.market.infranstructure.controllers;

import com.co.ias.market.categories.application.ports.input.CreateCategoryUseCase;
import com.co.ias.market.categories.application.ports.input.DeleteCategoryUseCase;
import com.co.ias.market.infranstructure.models.ApplicationError;
import com.co.ias.market.infranstructure.models.CategoryDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class CategoryController {

    private final CreateCategoryUseCase createCategoryUseCase;
    private final DeleteCategoryUseCase deleteCategoryUseCase;

    public CategoryController(CreateCategoryUseCase createCategoryUseCase, DeleteCategoryUseCase deleteCategoryUseCase) {
        this.createCategoryUseCase = createCategoryUseCase;
        this.deleteCategoryUseCase = deleteCategoryUseCase;
    }

    @RequestMapping(value = "/categories", method = RequestMethod.POST)
    public ResponseEntity<?> createCategory(@RequestBody CategoryDTO categoryDTO) {
        try {
            CategoryDTO categoryDTOOutput = createCategoryUseCase.execute(categoryDTO);
            return ResponseEntity.ok(categoryDTOOutput);
        } catch (NullPointerException | IllegalArgumentException e) {
            ApplicationError applicationError = new ApplicationError("InputDataValidationError",
                    "Bad input data", Map.of("error", e.getMessage()));
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(applicationError);
        } catch (Exception e) {
            ApplicationError applicationError = new ApplicationError("SystemError",
                    "Try more later", Map.of());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(applicationError);
        }
    }

    //¿Como hacerlo por ID, con el Path Variable
    @RequestMapping(value = "/categories/delete", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteCategory(@RequestBody CategoryDTO categoryDTO) {
        try {
            deleteCategoryUseCase.execute(categoryDTO);
            return ResponseEntity.ok("DELETED");
        } catch (NullPointerException | IllegalArgumentException e) {
            ApplicationError applicationError = new ApplicationError("InputDataValidationError",
                    "Bad input data", Map.of("error", e.getMessage()));
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(applicationError);
        } catch (Exception e) {
            ApplicationError applicationError = new ApplicationError("SystemError",
                    "Try more later", Map.of());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(applicationError);
        }
    }

}
