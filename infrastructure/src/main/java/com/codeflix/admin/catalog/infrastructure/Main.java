package com.codeflix.admin.catalog.infrastructure;

import com.codeflix.admin.catalog.application.category.create.CreateCategoryUseCase;
import com.codeflix.admin.catalog.application.category.delete.DeleteCategoryUseCase;
import com.codeflix.admin.catalog.application.category.retrieve.get.GetCategoryByIdUseCase;
import com.codeflix.admin.catalog.application.category.retrieve.list.ListCategoriesUseCase;
import com.codeflix.admin.catalog.application.category.update.UpdateCategoryUseCase;
import com.codeflix.admin.catalog.infrastructure.configuration.WebServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.sql.init.dependency.DependsOnDatabaseInitialization;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.AbstractEnvironment;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.setProperty(AbstractEnvironment.DEFAULT_PROFILES_PROPERTY_NAME, "development");
        SpringApplication.run(WebServerConfig.class, args);
    }

//    @Bean
//    @DependsOnDatabaseInitialization
//    ApplicationRunner runner(@Autowired CreateCategoryUseCase createCategoryUseCase,
//                             @Autowired UpdateCategoryUseCase updateCategoryUseCase,
//                             @Autowired DeleteCategoryUseCase deleteCategoryUseCase,
//                             @Autowired ListCategoriesUseCase listCategoriesUseCase,
//                             @Autowired GetCategoryByIdUseCase getCategoryByIdUseCase
//    ) {
//        return args -> {
//
//        };
//    }

}