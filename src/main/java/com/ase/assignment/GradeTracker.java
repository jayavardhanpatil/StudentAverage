package com.ase.assignment;

import java.util.HashMap;

/**
 * Created by jayavardhanpatil on 11/22/19
 */
public class GradeTracker implements GradeObserver{

    Student student;
    double points;
    GradeTracker(Student student){
        this.student = student;
        points = getStudentPoints();
    }

    public Character getGrade(){
        if(points >= 90){
            return 'A';
        }else if(points >=80){
            return 'B';
        }else if(points >= 70){
            return 'C';
        }else if(points >= 60){
            return 'D';
        }else if(points >= 50){
            return 'E';
        }else {
            return 'F';
        }
    }

    @Override
    public void update() {
        points = getStudentPoints();
    }

    private double getStudentPoints(){
        return this.student.getClassAverage();
    }
}
