package com.ase.assignment;

import java.util.ArrayList;

/**
 * Created by jayavardhanpatil on 11/22/19
 */
public class AlgorithemOne implements AverageStrategy {

    public double getAverage(ArrayList<Double> assignmentpoints, ArrayList<Double> examPoints) {

        return (((calculateAverage(assignmentpoints) / assignmentpoints.size()) * ASSIGNMENT_WEIGHTAGE) / 100) +
                ((calculateAverage(examPoints) / examPoints.size()) * EXAM_WEIGHTAGE / 100);
    }

    private double calculateAverage(ArrayList<Double> points){
        double sum = 0;
        for(double point : points){
            sum += point;
        }
        return sum;
    }
}
