package com.ase.assignment;

/**
 * Created by jayavardhanpatil on 11/22/19
 */
public class Application {

    public static void main(String[] args) {

        Student student = new Student("John");
        student.addAssignmentScore(90);
        student.addAssignmentScore(98);
        student.addAssignmentScore(100);
        student.addExamScore(87);
        student.addExamScore(50);

        //Average Using Algorithm A
        student.setDropLowerAssignment(false);
        System.out.println("\nAlgorithm - (A) \n With considering all the scores" );
        System.out.println(student.getStudentName() + " : "+ student.getClassAverage());
        System.out.println("=========================");

        //Average Using Algorithm B
        student.setDropLowerAssignment(true);
        System.out.println("\nAlgorithm - (B) \n removing lowest assignment score" );
        System.out.println(student.getStudentName() + " : "+ student.getClassAverage());
        System.out.println("=========================");

        //switching back to algorithm A
        student.setDropLowerAssignment(false);
        System.out.println("\nAlgorithm - (A) \n With considering all the scores" );
        System.out.println(student.getStudentName() + " : "+ student.getClassAverage());
        System.out.println("=========================");


        //Question B;
        GradeTracker tracker = new GradeTracker(student);
        student.registerTracker(tracker);
        System.out.println("Current Grade : "+tracker.getGrade());
        student.addExamScore(91);
        System.out.println("After Adding Exam Score : "+tracker.getGrade());

        //Question C:

    }
}
