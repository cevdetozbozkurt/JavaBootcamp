package com.odev3.business;

import java.util.ArrayList;
import com.odev3.dataAccess.CategoryDao;
import com.odev3.entities.Category;
import com.odev3.logger.Logger;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;

    ArrayList<String> categoryNames = new ArrayList<String>();

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception{
        for(String categoryName : categoryNames){
            if(category.getCategoryName().equalsIgnoreCase(categoryName)){
                throw new Exception("Kategori adi ayni olamaz");
            }else{
                categoryDao.add(category);
                categoryNames.add(categoryName);
            }
            for (Logger logger : loggers) {
                logger.log(category.getCategoryName());
            }
        }
    }
    

}
