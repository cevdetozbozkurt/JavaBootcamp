package com.odev3;

import com.odev3.business.CategoryManager;
import com.odev3.business.CourseManager;
import com.odev3.business.TeacherManager;
import com.odev3.dataAccess.HibernateCategory;
import com.odev3.dataAccess.HibernateCourseDao;
import com.odev3.dataAccess.HibernateTeacherDao;
import com.odev3.entities.Category;
import com.odev3.entities.Course;
import com.odev3.entities.Teacher;
import com.odev3.logger.DatabaseLogger;
import com.odev3.logger.FileLogger;
import com.odev3.logger.Logger;

public class Main {
    public static void main(String[] args) throws Exception {
        Course course1 = new Course(1, "Yazilim Geliştirici Yetiştirme Kampi: C# + ANGULAR", 1);
        Course course2 = new Course(2, "Senior Yazilim Geliştirici Yetiştirme Kampi: .NET", 100);
        
        Category category1 = new Category("Tümü", 1);
        Category category = new Category("Programlama", 2);

        Teacher teacher1 = new Teacher("Engin", "Demiroğ", 1);
        
        Logger[] loggers = {new DatabaseLogger(), new FileLogger()};

        CategoryManager categoryManager = new CategoryManager(new HibernateCategory(), loggers);
        categoryManager.add(category1);
        categoryManager.add(category);

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(course1);
        courseManager.add(course2);

        TeacherManager teacherManager = new TeacherManager(new HibernateTeacherDao(), loggers);
        teacherManager.add(teacher1);

    }
}
