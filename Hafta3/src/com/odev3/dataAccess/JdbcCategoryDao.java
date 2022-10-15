package com.odev3.dataAccess;

import com.odev3.entities.Category;

public class JdbcCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Kategori JDBC ile veritabanina eklendi.");
    }
}
