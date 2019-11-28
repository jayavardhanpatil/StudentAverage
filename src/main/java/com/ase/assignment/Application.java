package com.ase.assignment;

/**
 * Created by jayavardhanpatil on 11/22/19
 */
public class Application {

    public static void main(String[] args) {

        Student student = new Student("ABC");
        student.addAssignmentScore(90);
        student.addAssignmentScore(98);
        student.addAssignmentScore(100);
        student.addExamScore(87);
        student.addExamScore(91);

        student.setDropLowerAssignment(false);
        System.out.println("\nAlgorithm - (1) \n With considering all the scores" );
        System.out.println(student.getStudentName() + " : "+ student.getClassAverage());
        System.out.println("=========================");

        student.setDropLowerAssignment(true);
        System.out.println("\nAlgorithm - (2) \n With removing lowest assignment scores" );
        System.out.println(student.getStudentName() + " : "+ student.getClassAverage());
        System.out.println("=========================");

        //switching back to algorithm A
        student.setDropLowerAssignment(false);
        System.out.println("\nAlgorithm - (1) \n With removing lowest assignment scores" );
        System.out.println(student.getStudentName() + " : "+ student.getClassAverage());
        System.out.println("=========================");
    }
}
