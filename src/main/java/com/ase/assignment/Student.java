package com.ase.assignment;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by jayavardhanpatil on 11/20/19
 */

class Student implements GradeNotifier{

    private String name;
    private ArrayList<Double> assignments;
    private ArrayList<Double> examScores;
    private AverageStrategy averageStrategy;
    private boolean isDropLowestScore = false;
    private GradeObserver observer;

    Student(String name){
        this.name = name;
        this.assignments = new ArrayList<>();
        this.examScores = new ArrayList<>();
    }

    void addAssignmentScore(double as){
        System.out.println(name + "'s Assignment score is : "+ as);
        if(observer!=null) notifyObeserver();
        assignments.add(as);
    }

    void addExamScore (double es){
        System.out.println(name + "'s Exam score is : "+ es);
        examScores.add(es);
        notifyObeserver();
    }

    String getStudentName(){
        return name;
    }

    private void setAverageStrategy(AverageStrategy newAverageStrategy){
        this.averageStrategy = newAverageStrategy;
    }

    double getClassAverage(){

        if(!isDropLowestScore){
            setAverageStrategy(new AlgorithemOne());
            return averageStrategy.getAverage(assignments,examScores);
        }else{
            setAverageStrategy(new AlgorithmTwo());
            return averageStrategy.getAverage(assignments,examScores);
        }
    }

    void setDropLowerAssignment(boolean algoType){
        this.isDropLowestScore = algoType;
    }

    @Override
    public void registerNotifier(GradeObserver observer) {
        this.observer = observer;
    }

    @Override
    public void notifyObeserver() {
        if(observer != null) {
            observer.update();
        }
    }
}
