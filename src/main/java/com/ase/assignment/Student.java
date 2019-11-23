package com.ase.assignment;

import java.util.ArrayList;

/**
 * Created by jayavardhanpatil on 11/20/19
 */
public class Student{

    private String name;
    private ArrayList<Double> assignments;
    private ArrayList<Double> examScores;

    Student(String name){
        this.name = name;
        this.assignments = new ArrayList<Double>();
        this.examScores = new ArrayList<Double>();
    }

    public void addAssignmentScore(double as){
        assignments.add(as);
    }

    public void addExamScore (double es){
        examScores.add(es);
    }

    public double getAverage(){
        return 0.0;
    }

}
