package com.odev3.dataAccess;

import com.odev3.entities.Course;

public class JdbcCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Kurs JDBC ile veritabanina eklendi.");
    }
}
