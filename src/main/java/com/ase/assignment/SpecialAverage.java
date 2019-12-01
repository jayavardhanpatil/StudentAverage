package com.ase.assignment;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by jayavardhanpatil on 11/22/19
 */
public class SpecialAverage implements AverageStrategy {


    @Override
    public double getAverage(ArrayList<Double> assignmentPoints, ArrayList<Double> examPoints) {
        double assignmentSum = 0;
        double assignmentAvg = 0;

        if(assignmentPoints.size() > 1) {
            Collections.sort(assignmentPoints);
            for (int i = 1; i < assignmentPoints.size(); i++) {
                assignmentSum += assignmentPoints.get(i);
            }
            assignmentAvg = calculateWeightedAverage(assignmentSum, ASSIGNMENT_WEIGHTAGE, assignmentPoints.size() - 1);
        }else{
            assignmentSum = totalPoints(assignmentPoints);
            assignmentAvg = calculateWeightedAverage(assignmentSum, ASSIGNMENT_WEIGHTAGE, assignmentPoints.size());
        }

        double examSum = totalPoints(examPoints);
        return (assignmentAvg + (calculateWeightedAverage(examSum, EXAM_WEIGHTAGE, examPoints.size())));
    }

    private double calculateWeightedAverage(double totalPoints, double weightage, int size){
        return (totalPoints / size) * weightage / 100;
    }

    private double totalPoints(ArrayList<Double> points){
        double sum = 0;
        for(double point : points){
            sum += point;
        }
        return sum;
    }
}
