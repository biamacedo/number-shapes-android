package com.macedo.numbershapes;

/**
 * Created by Beatriz on 24/10/2015.
 */
public class Number {
    int number;

    public boolean isTriangular(){
        int x = 1;
        int triangularNumber = 1;
        while (triangularNumber < number){
            x++;
            triangularNumber += x;
        }
        if (triangularNumber == number){
            return true;
        } else { return false; }
    }

    public boolean isSquare(){

        double squareRoot = Math.sqrt(number);

        if( squareRoot == Math.floor(squareRoot)) {
            return true;
        } else { return false; }
    }
}