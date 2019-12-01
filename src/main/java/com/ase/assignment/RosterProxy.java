package com.ase.assignment;

import java.util.ArrayList;

/**
 * Created by jayavardhanpatil on 11/30/19
 */

public class RosterProxy implements AvgDispenser {

    private int count = 0;
    private ArrayList<Student> students;

    RosterProxy(ArrayList<Student> students){
        this.students = students;
    }

    @Override
    public double getNextStudentAvg() {
        return students.get(count++).getClassAverage();
    }

    @Override
    public boolean hasNext() {
        return count == students.size();
    }
}
