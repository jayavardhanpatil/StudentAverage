package com.ase.assignment;

import java.util.ArrayList;

/**
 * Created by jayavardhanpatil on 11/30/19
 */

public class AverageDispenserProxy implements AvgDispenser {

    private int count = 0;
    private ArrayList<Student> students;

    AverageDispenserProxy(ArrayList<Student> students){
        this.students = students;
    }

    @Override
    public double getNextStudentAvg() {
        return students.get(count++).getClassAverage();
    }

    @Override
    public boolean done() {
        return count == students.size();
    }
}
