package com.odev3.entities;

public class Teacher {
    private String firsName;
    private String lastName;
    private int id;

    public Teacher(String firsName, String lastName, int id) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }
    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    
}
