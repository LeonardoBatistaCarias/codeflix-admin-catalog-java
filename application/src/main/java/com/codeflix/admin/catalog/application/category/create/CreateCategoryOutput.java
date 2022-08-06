package com.codeflix.admin.catalog.application.category.create;

import com.codeflix.admin.catalog.domain.category.Category;
import com.codeflix.admin.catalog.domain.category.CategoryID;

public record CreateCategoryOutput(
        String id
) {

    public static CreateCategoryOutput from(final String anId){
        return new CreateCategoryOutput(anId);
    }

    public static CreateCategoryOutput from(final Category aCategory){
        return new CreateCategoryOutput(aCategory.getId().getValue());
    }
}
