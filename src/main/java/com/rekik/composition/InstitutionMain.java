package com.rekik.composition;

import java.util.ArrayList;
import java.util.Scanner;

public class InstitutionMain {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Institution anInstitution;
        Course aCourse;
        String courseAnswer="";
        String instAnswer="";
        boolean done = false;
        boolean instDone = false;
       // ArrayList<Course> courses = new ArrayList<>();

        ArrayList<Institution> institutions = new ArrayList<>();

        do{
        System.out.println("Enter the name of institution: ");
        anInstitution = new Institution(reader.nextLine());

        System.out.println("Your institution is called: "+anInstitution.getName());


        do {
            aCourse=new Course();
            System.out.println("Enter course title:");
            aCourse.setCourseName(reader.nextLine());

            System.out.println("Enter course number:");
            aCourse.setCourseNumber(reader.nextLine());

            System.out.println("Enter room number");
            aCourse.setRoomNumber(reader.nextLine());

            System.out.println("Your course details: Course name: " + aCourse.getCourseName() +
                    " Room Number: " + aCourse.getRoomNumber() + " Course number: " + aCourse.getCourseNumber());
            anInstitution.addCourse(aCourse);

            System.out.println("Do you want to enter details of another course?");
            courseAnswer=reader.nextLine();

            if (courseAnswer.equalsIgnoreCase("no") || courseAnswer.equalsIgnoreCase("n"))
                done=true;
            //else done=false;

            //terinary operator
            System.out.println("You responded:" + (done ? "I am done" : "I am not done"));
        }while (!done);

        //anInstitution.setTheCourses(courses);
            institutions.add(anInstitution);

        System.out.println("Do you want to enter details of another Institution?");
        instAnswer=reader.nextLine();

        if (instAnswer.equalsIgnoreCase("no") || instAnswer.equalsIgnoreCase("n"))
            instDone=true;

        //terinary operator
        System.out.println("You responded:" + (instDone ? "I am done" : "I am not done"));

        }while (!instDone);


        for(Institution eachInstitution: institutions){
            System.out.println("These are the course for "+eachInstitution.getName());
            for(Course eachCourse: eachInstitution.getTheCourses()) {
                System.out.println("These are the details of the course: Course Number " + eachCourse.getCourseNumber() +
                        " Title " + eachCourse.getCourseName() + " Room:" + eachCourse.getRoomNumber());
            }
        }


    }
}
