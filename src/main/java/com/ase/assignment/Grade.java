package com.ase.assignment;

/**
 * Created by jayavardhanpatil on 11/22/19
 */
public class Grade {

    public Character getGrade(double points){

        if(points >= 90){
            return 'A';
        }else if(points >=80){
            return 'B';
        }else {
            return 'C';
        }

    }

}
