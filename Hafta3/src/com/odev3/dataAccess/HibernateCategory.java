package com.odev3.dataAccess;

import com.odev3.entities.Category;

public class HibernateCategory implements CategoryDao{

    @Override
    public void add(Category category) {
        System.out.println("Kategori Hibernate ile veri tabanina eklendi.");
    }
    
}
