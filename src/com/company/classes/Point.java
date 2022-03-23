package com.company.classes;

public class Point {
    private double xPoint;
    private double yPoint;
    private double zPoint;

    public Point(){

    }

    public Point(double x, double y){
        this.xPoint = x;
        this.yPoint = y;
    }
    public Point(double x, double y, double z){
        this.xPoint = x;
        this.yPoint = y;
        this.zPoint = z;
    }

    public double getxPoint(){
        return this.xPoint;
    }

    public double getyPoint(){
        return this.yPoint;
    }

    public double getzPoint(){
        return  this.zPoint;
    }
}
