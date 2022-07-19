package com.codeflix.admin.catalog.domain.category;

import com.codeflix.admin.catalog.domain.Identifier;

import java.util.Objects;
import java.util.UUID;

public class CategoryID extends Identifier {

    private final String value;

    private CategoryID(String value) {
        Objects.requireNonNull(value);
        this.value = value;
    }

    public static CategoryID unique() {
        return new CategoryID(UUID.randomUUID().toString().toLowerCase());
    }

    public static CategoryID from(final String anId) {
        return new CategoryID(anId);
    }

    public static CategoryID from(final UUID anID) {
        return new CategoryID(anID.toString().toLowerCase());
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryID that = (CategoryID) o;
        return getValue().equals(that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}
