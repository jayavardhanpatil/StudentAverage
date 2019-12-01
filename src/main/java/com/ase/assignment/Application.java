package com.ase.assignment;

import java.util.ArrayList;

/**
 * Created by jayavardhanpatil on 11/22/19
 */
public class Application {

    public static void main(String[] args) {

        Student student = new Student("Ross");
        student.addAssignmentScore(90);
        student.addAssignmentScore(98);
        student.addAssignmentScore(100);
        student.addExamScore(87);
        student.addExamScore(80);

        //Average Using Algorithm A
        student.setDropLowerAssignment(false);
        System.out.println("\nAlgorithm - (A) \n With considering all the scores" );
        System.out.println(student.getStudentName() + " : "+ student.getClassAverage());
        System.out.println("-------------------------");

        //Average Using Algorithm B
        student.setDropLowerAssignment(true);
        System.out.println("\nAlgorithm - (B) \n removing lowest assignment score" );
        System.out.println(student.getStudentName() + " : "+ student.getClassAverage());
        System.out.println("-------------------------");

        //switching back to algorithm A
        student.setDropLowerAssignment(false);
        System.out.println("\nAlgorithm - (A) \n With considering all the scores" );
        System.out.println(student.getStudentName() + " : "+ student.getClassAverage());
        System.out.println("=========================");


        //Question B;
        System.out.println("\nQuestion (B)");
        System.out.println("Track student grade");
        System.out.println("--------------------------");
        GradeTracker tracker = new GradeTracker(student);
        student.registerNotifier(tracker);
        System.out.println("Current Grade : "+tracker.getGrade());
        System.out.println("Adding another exam score");
        student.addExamScore(91);
        System.out.println("After Adding Exam Score : "+tracker.getGrade());
        System.out.println("=========================");

        //Question C:
        System.out.println("\nQuestion (C)");
        System.out.println("Adding second student scores");
        Student student1 = new Student("Joey");
        student1.addAssignmentScore(90);
        student1.addAssignmentScore(98);
        student1.addAssignmentScore(100);
        student1.addExamScore(87);
        student1.addExamScore(70);

        Roster computer = new Roster("Computer","CS1234");
        computer.addStudent(student);
        computer.addStudent(student1);

        System.out.println("\n\nget student's average scores");
        System.out.println("---------------------------");
        AvgDispenser avgDispenser = computer.getDispenser();

        while (!avgDispenser.hasNext()){
            System.out.println("Next Student average is : "+avgDispenser.getNextStudentAvg());
        }



        //Test with multiple clients
      /*AvgDispenser avgDispenser1 = computer.getDispenser();
        AvgDispenser avgDispenser2 = computer.getDispenser();
        AvgDispenser avgDispenser3 = computer.getDispenser();

        ArrayList<AvgDispenser> clients = new ArrayList<>();
        clients.add(avgDispenser);
        clients.add(avgDispenser1);
        clients.add(avgDispenser2);
        clients.add(avgDispenser3);

        clients.parallelStream().forEach(x -> {
            getAverage(x);
        });
    }

    private static void getAverage(AvgDispenser ad){
        while (!ad.done()){
            System.out.println(ad.hashCode()+ " Next Student average is : "+ad.getNextStudentAvg());
        }*/
    }
}
