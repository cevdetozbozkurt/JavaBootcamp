package com.odev3.dataAccess;

import com.odev3.entities.Course;

public class HibernateCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Kurs Hibernate ile veritabanina eklendi.");
    }
}
