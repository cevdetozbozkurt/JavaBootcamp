package com.odev3.entities;

public class Course {
    private String courseName;
    private int courseId;
    private double coursePrice;

    public Course(int courseId, String courseName, double coursePrice) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.coursePrice = coursePrice;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    



}
