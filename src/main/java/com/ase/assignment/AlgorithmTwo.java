package com.ase.assignment;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by jayavardhanpatil on 11/22/19
 */
public class AlgorithmTwo implements AverageStrategy {


    @Override
    public double getAverage(ArrayList<Double> assignmentPoints, ArrayList<Double> examPoints) {
        double assignmentSum = 0;
        if(assignmentPoints.size() > 1) {
            Collections.sort(assignmentPoints);
            for (int i = 1; i < assignmentPoints.size(); i++) {
                assignmentSum += assignmentPoints.get(i);
            }
        }else{
            assignmentSum = calculateAverage(assignmentPoints);
        }
        double examSum = calculateAverage(examPoints);

        return ((assignmentSum / (assignmentPoints.size()-1)) * ASSIGNMENT_WEIGHTAGE / 100) +
                ((examSum / examPoints.size()) * EXAM_WEIGHTAGE / 100);
    }

    private double calculateAverage(ArrayList<Double> points){
        double sum = 0;
        for(double point : points){
            sum += point;
        }
        return sum;
    }
}
