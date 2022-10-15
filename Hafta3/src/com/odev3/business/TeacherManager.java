package com.odev3.business;

import com.odev3.dataAccess.TeacherDao;
import com.odev3.entities.Teacher;
import com.odev3.logger.Logger;

public class TeacherManager {
    private TeacherDao teacherDao;
    private Logger[] loggers;

    public TeacherManager(TeacherDao teacherDao, Logger[] loggers) {
        this.teacherDao = teacherDao;
        this.loggers = loggers;
    }

    public void add(Teacher teacher){
        teacherDao.add(teacher);
        for (Logger logger : loggers) {
            logger.log(String.valueOf(teacher.getId()) + " id'li Ogretmen loglandi.");
            
        }
    }
}
