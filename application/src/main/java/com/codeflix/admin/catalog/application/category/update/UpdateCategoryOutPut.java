package com.codeflix.admin.catalog.application.category.update;

import com.codeflix.admin.catalog.domain.category.Category;
import com.codeflix.admin.catalog.domain.category.CategoryID;

public record UpdateCategoryOutPut(
        CategoryID id
) {

    public static UpdateCategoryOutPut from(final Category aCategory) {
        return new UpdateCategoryOutPut(aCategory.getId());
    }
}
