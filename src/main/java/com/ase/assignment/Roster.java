package com.ase.assignment;

import java.util.ArrayList;

/**
 * Created by jayavardhanpatil on 11/20/19
 */
public class Roster{

    private String courseName;
    private String courseNumber;
    private ArrayList<Student> students;

    Roster(String name, String courseNumber){
        this.courseName = name;
        this.courseNumber = courseNumber;
        students = new ArrayList<Student>();
    }

    String getCourseName(){
        return courseName;
    }

    void addStudent(Student student){
        students.add(student);
    }

    AvgDispenser getDispenser(){
        return new RosterProxy(students);
    }
}
