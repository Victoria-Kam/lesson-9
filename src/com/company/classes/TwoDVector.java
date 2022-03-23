package com.company.classes;

import com.company.Main;
import com.company.interfaces.Vector;

public class TwoDVector implements Vector {

    private Print print;

    private Point first;
    private Point second;

    private final String information = "Это вектор для двумерной системы координат.";

    private final String multiplicationInformation = "Произведение матриц можно посчитать в трехмерном пространстве (правило правой руки)";


    public TwoDVector() {
        if (this.print == null) {
            print = new Print();
        }
    }

    public TwoDVector(Point first, Point second) {
        if (this.print == null) {
            print = new Print();
        }
        this.first = first;
        this.second = second;
    }

    @Override
    public void calculateVectorLength() {          // находим длину вектора

        double vectorOne;
        double vectorTwo;

        vectorOne = Math.sqrt((Math.pow(first.getxPoint(), 2)) + Math.pow(first.getyPoint(), 2));
        vectorTwo = Math.sqrt((Math.pow(second.getxPoint(), 2)) + Math.pow(second.getyPoint(), 2));
        print.printTwoDVectorLength(vectorOne, vectorTwo, this.first, this.second);

    }

    @Override
    public void calculateMultiplicationOfVectors() {          // находим произведение вектора
        print.printMultiplication(this.multiplicationInformation);

    }

    @Override
    public void calculateSummOfVectors() {          // находим сумму вектора
        print.printSumm((this.first.getxPoint() + this.second.getxPoint()),
                (this.first.getyPoint() + this.second.getyPoint()), this.first, this.second);
    }

    @Override
    public void calculateTheDifferenceOfVectors() {          // находим разность вектора
        print.printDifference((this.first.getxPoint() - this.second.getxPoint()),
                (this.first.getyPoint() - this.second.getyPoint()), this.first, this.second);
    }

    public void vectorComparison() {

        boolean isSame = false;

        if ((this.first.getxPoint() == this.second.getxPoint()) && (this.first.getyPoint() == this.second.getyPoint())) {
            isSame = true;
        }

        print.comparisonVector(isSame, first, second);
    }

    public String getInformation(){
        return this.information;
    }
}
