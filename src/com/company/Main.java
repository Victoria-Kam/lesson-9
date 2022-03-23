package com.company;

import com.company.classes.Point;
import com.company.classes.ThreeDVector;
import com.company.classes.TwoDVector;
import com.company.interfaces.Vector;

public class Main {

    public static void main(String[] args) {

        Point a = new Point(3, 5);
        Point b = new Point(2, 7);

        Vector vector = new TwoDVector(a, b);

        System.out.println(vector.getInformation());
        vector.calculateVectorLength();
        vector.calculateSummOfVectors();
        vector.calculateMultiplicationOfVectors();
        vector.calculateTheDifferenceOfVectors();
        vector.vectorComparison();


        System.out.println("\n\n");

        Point c = new Point(3,5,8);
        Point d = new Point(3,4,7);

        Vector secondVector = new ThreeDVector(c,d);

        System.out.println(secondVector.getInformation());
        secondVector.calculateVectorLength();
        secondVector.calculateSummOfVectors();
        secondVector.calculateMultiplicationOfVectors();
        secondVector.calculateTheDifferenceOfVectors();
        secondVector.vectorComparison();
    }
}
