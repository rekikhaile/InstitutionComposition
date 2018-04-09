package com.rekik.composition;

public class Course {
    private String courseName;
    private String courseNumber;
    private String roomNumber;

    public Course() {
    }

    public Course(String courseName, String courseNumber, String roomNumber) {
        this.courseName=courseName;
        this.courseNumber=courseNumber;
        this.roomNumber=roomNumber;
    }

    public Course(String courseName, String courseNumber) {
        this.courseName=courseName;
        this.courseNumber=courseNumber;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName=courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber=courseNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber=roomNumber;
    }
}
