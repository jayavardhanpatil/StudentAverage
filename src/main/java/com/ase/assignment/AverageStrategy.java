package com.ase.assignment;

import java.util.ArrayList;

/**
 * Created by jayavardhanpatil on 11/21/19
 */
public interface AverageStrategy {

    double ASSIGNMENT_WEIGHTAGE = 40.0;
    double EXAM_WEIGHTAGE = 60.0;

    double getAverage(ArrayList<Double> assignmentPoints, ArrayList<Double> examPoints);

}
