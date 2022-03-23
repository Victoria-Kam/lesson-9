package com.company.classes;

import com.company.interfaces.Vector;

public class ThreeDVector implements Vector {

    private Print print;

    private Point first;
    private Point second;

    private final String information = "Это вектор для трехмерной системы координат.";

    private final String multiplicationInformation = "Произведение матриц можно посчитать в трехмерном пространстве (правило правой руки)";


    public ThreeDVector() {
        if (this.print == null) {
            print = new Print();
        }
    }

    public ThreeDVector(Point first, Point second) {
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


        vectorOne = Math.sqrt((Math.pow(this.first.getxPoint(), 2)) + Math.pow(this.first.getyPoint(), 2) + Math.pow(this.first.getzPoint(), 2));
        vectorTwo = Math.sqrt((Math.pow(this.second.getxPoint(), 2)) + Math.pow(this.second.getyPoint(), 2) + Math.pow(this.second.getzPoint(), 2));
        print.printThreeDVectorLength(vectorOne, vectorTwo, this.first, this.second);

    }

    @Override
    public void calculateMultiplicationOfVectors() {          // находим произведение вектора

        double i;
        double j;
        double k;

        i = (first.getyPoint() * second.getzPoint()) - (first.getzPoint() * second.getyPoint());
        j = (first.getxPoint() * second.getzPoint()) - (first.getzPoint() * second.getxPoint());
        k = (first.getxPoint() * second.getyPoint()) - (first.getyPoint() * second.getxPoint());

        if (j < 0) {
            j = -j;         //  посмотрено на stackoverflow
        }
        print.printMultiplication(first, second, i, j, k);

    }

    @Override
    public void calculateSummOfVectors() {          // находим сумму вектора
        print.printSumm((this.first.getxPoint() + this.second.getxPoint()),
                (this.first.getyPoint() + this.second.getyPoint()),
                (this.first.getzPoint() + this.second.getzPoint()), this.first, this.second);
    }

    @Override
    public void calculateTheDifferenceOfVectors() {          // находим разность вектора
        print.printDifference((this.first.getxPoint() - this.second.getxPoint()),
                (this.first.getyPoint() - this.second.getyPoint()),
                (this.first.getzPoint() - this.second.getzPoint()), this.first, this.second);
    }

    public void vectorComparison() {

        boolean isSame = false;

        if ((this.first.getxPoint() == this.second.getxPoint()) && (this.first.getyPoint() == this.second.getyPoint()) && (this.first.getzPoint() == this.second.getzPoint())) {
            isSame = true;
        }

        print.comparisonVectorforThreeD(isSame, first, second);
    }

    public String getInformation() {
        return this.information;
    }
}
