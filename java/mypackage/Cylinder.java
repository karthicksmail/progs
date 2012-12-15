import java.io.*;
import java.lang.String;
import java.lang.Math;
package mypackage;

class Cylinder{
  double pi=3.14159;
  double radius, height;

  Cylinder(double radius, double height){
    this.radius = radius;
    this.height = height;
  }

  public double getRadius(){
    return radius;
  }

  public double getHeight(){
    return height;
  }

  public double calcVolume(){
    return (pi * height * Math.pow(radius,2));
  }

  public double calcSurfaceArea(){
    return (2 * pi * radius * (height + radius));
  }

  public static void main(String args[]) {
    Cylinder c1 = new Cylinder(5,5);
    System.out.println("Volume of cylinder of radius " + c1.getRadius() + " and height " + c1.getHeight() + " is " + c1.calcVolume());
    System.out.println("Area of cylinder of radius " + c1.getRadius() + " and height " + c1.getHeight() + " is " + c1.calcSurfaceArea());
  }
}

