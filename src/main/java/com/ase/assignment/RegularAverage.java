package com.ase.assignment;

import java.util.ArrayList;

/**
 * Created by jayavardhanpatil on 11/22/19
 */
public class RegularAverage implements AverageStrategy {

    public double getAverage(ArrayList<Double> assignmentpoints, ArrayList<Double> examPoints) {

        return (calculateWeightedAverage(calculateAverage(assignmentpoints), ASSIGNMENT_WEIGHTAGE, assignmentpoints.size())) +
                (calculateWeightedAverage(calculateAverage(examPoints), EXAM_WEIGHTAGE, examPoints.size()));
    }

    private double calculateAverage(ArrayList<Double> points){
        double sum = 0;
        for(double point : points){
            sum += point;
        }
        return sum;
    }

    private double calculateWeightedAverage(double totalPoints, double weightage, int size){
        return (totalPoints / size) * weightage / 100;
    }
}
