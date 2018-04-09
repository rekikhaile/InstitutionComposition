package com.rekik.composition;

import java.util.ArrayList;

public class Institution {
    private String name;
    ArrayList<Course> theCourses;

    public Institution() {
    }

    public Institution(String name) {
        this.name=name;
        theCourses = new ArrayList<>();
    }

    public  void addCourse(Course course)
    {
        this.theCourses.add(course);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public ArrayList<Course> getTheCourses() {
        return theCourses;
    }

    public void setTheCourses(ArrayList<Course> theCourses) {
        this.theCourses=theCourses;
    }
}
