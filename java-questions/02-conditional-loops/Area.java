/*
Assigment Question Basic
- Area Of Circle 
- Area Of Triangle
- Area Of Isosceles Triangle
- Area Of Equilateral Triangle
- Area Of Rectangle 
- Area Of Parallelogram
- Area Of Rhombus
*/

import java.util.Scanner;

public class Area {

  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    areaOfCircle(5);
    areaOfTriange(5,6);
    areaOfIsoscelesTriangle(8,6);
    areaOfEquilateralTriangle(5);
    areaOfRectangle(10,20);
    areaOfParallelogram(10,15);
    areaOfRhombus(25,23);

    
  }
  static void areaOfCircle(double r){
    final double PI=3.14;
    double area=PI*(r*r);
    System.out.println("Area of Circle: "+area);
  }

  static void areaOfTriange(double height, double base){
    double area=(height*base)/2;
    System.out.println("Area of Triangle: "+area);
  }

  static void areaOfIsoscelesTriangle(double height, double base){
    double area=(height*base)/2;
    System.out.println("Area of Isosceles Triangle: "+area);
  }
  static void areaOfEquilateralTriangle(double side){
    double area=(Math.sqrt(3)/4)*(side*side);
    System.out.println("Area of Equilateral Triangle: "+area);
  }
  static void areaOfRectangle(double length, double width){
    double area=length*width;
    System.out.println("Area of Rectangle: "+area);
  }
  static void areaOfParallelogram(double height, double base){
    double area=height*base;
    System.out.println("Area of Parallelogram: "+area);
  }
  static void areaOfRhombus(double diagonal1, double diagonal2){
    double area=(diagonal1*diagonal2)/2;
    System.out.println("Area of Rhombus: "+area);

  }
}
