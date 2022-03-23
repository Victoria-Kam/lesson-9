package com.company.classes;

public class Print {

    public void printTwoDVectorLength(double vectorOne, double vectorTwo, Point first, Point second) {           // вывод длины вектора
        System.out.println("Длина первого вектора [ " + first.getxPoint() + " , " + first.getyPoint() + " ] равна " + String.format("%.2f", vectorOne) +
                "\nи длина второго вектора равна[ " + second.getxPoint() + " , " + second.getyPoint() + " ]  равна: " + String.format("%.2f", vectorTwo));
    }

    public void printThreeDVectorLength(double vectorOne, double vectorTwo, Point first, Point second) {           // вывод длины вектора
        System.out.println("Длина первого вектора [ " + first.getxPoint() + " , " + first.getyPoint() + " , " + first.getzPoint() + " ] равна " + String.format("%.2f", vectorOne) +
                "\nи длина второго вектора равна [ " + second.getxPoint() + " , " + second.getyPoint() + " , " + second.getzPoint() + " ]  равна " + String.format("%.2f", vectorTwo));
    }

    public void printMultiplication(String information) {         // вывод произведения векторов
        System.out.println(information);
    }

    public void printMultiplication(Point first, Point second, double i, double j, double k) {         // вывод произведения векторов
        System.out.println("Произведение первого вектора [ " + first.getxPoint() + " , " + first.getyPoint() + " , " + first.getzPoint() + " ] и " +
                " второго вектора [ " + second.getxPoint() + " , " + second.getyPoint() + " , " + second.getzPoint() + " ]  равна [ "
                + String.format("%.2f", i) + " , " + String.format("%.2f", j) + " , " + String.format("%.2f", k) + " ]");
    }

    public void printSumm(double xPoint, double yPoint, Point first, Point second) {           // вывод суммы векторов
        System.out.println("Сумма векторов [" + first.getxPoint() + "," + first.getyPoint() + "] и [" + second.getxPoint() +
                "," + second.getyPoint() + " равна: [" + xPoint + "," + yPoint + "]");
    }

    public void printSumm(double xPoint, double yPoint, double zPoint, Point first, Point second) {           // вывод суммы векторов
        System.out.println("Сумма векторов [ " + first.getxPoint() + " , " + first.getyPoint() + " , " + first.getzPoint() + " ] и " +
                " [ " + second.getxPoint() + " , " + second.getyPoint() + " , " + second.getzPoint() + " ]  равна [ "
                + String.format("%.2f", xPoint) + " , " + String.format("%.2f", yPoint) + " , " + String.format("%.2f", zPoint) + " ]");
    }

    public void printDifference(double xPoint, double yPoint, Point first, Point second) {         // вывод разности векторов
        System.out.println("Разность векторов [ " + first.getxPoint() + "," + first.getyPoint() + " ] и [ " + second.getxPoint() +
                " , " + second.getyPoint() + " ] равна: [ " + xPoint + "," + yPoint + " ]");
    }

    public void printDifference(double xPoint, double yPoint, double zPoint, Point first, Point second) {         // вывод разности векторов
        System.out.println("Разность векторов [ " + first.getxPoint() + " , " + first.getyPoint() + " , " + first.getzPoint() + " ] и " +
                " [ " + second.getxPoint() + " , " + second.getyPoint() + " , " + second.getzPoint() + " ]  равна [ "
                + String.format("%.2f", xPoint) + " , " + String.format("%.2f", yPoint) + " , " + String.format("%.2f", zPoint) + " ]");
    }

    public void comparisonVector(boolean isSame, Point first, Point second) {
        System.out.println("Сравнение векторов [ " + first.getxPoint() + " , " + first.getyPoint() + " ] и [ " + second.getxPoint() +
                " , " + second.getyPoint() + " ] - " + isSame);
    }

    public void comparisonVectorforThreeD(boolean isSame, Point first, Point second) {
        System.out.println("Сравнение векторов [ " + first.getxPoint() + " , " + first.getyPoint() + " , " + first.getzPoint() + " ] и " +
                "  и [ " + second.getxPoint() + " , " + second.getyPoint() + " , " + second.getzPoint() + " ] - " + isSame);
    }
}
