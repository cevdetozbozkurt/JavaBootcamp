package com.odev3.business;

import java.util.ArrayList;

import com.odev3.dataAccess.CourseDao;
import com.odev3.entities.Course;
import com.odev3.logger.Logger;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;
    
    ArrayList<String> courseNames = new ArrayList<String>();
 
    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception{
        if(course.getCoursePrice() <= 0){
            throw new Exception("Kurs fiyati 0 veya daha kucuk olamaz");
        }
        for (String courseName : courseNames) {
            if(courseName == course.getCourseName()){
                throw new Exception("Kurs ismi ayni olamaz.");
            }else{
                courseDao.add(course);
                courseNames.add(courseName);
                for (Logger logger : loggers) {
                    logger.log(course.getCourseName());
                }    
            }
            
        }
    }

}
