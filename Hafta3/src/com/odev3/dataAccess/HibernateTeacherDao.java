package com.odev3.dataAccess;

import com.odev3.entities.Teacher;

public class HibernateTeacherDao implements TeacherDao{
    @Override
    public void add(Teacher teacher) {
        System.out.println("Ogretmen hibernate ile veritabanina eklendi.");
    }
}
