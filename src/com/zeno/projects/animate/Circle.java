/**
 * @author Daniel M.
 * save as "Circle.java"
 * private instance variable, not accessible from outside this class 
 */
package com.zeno.projects.animate;

public class Circle { 

 private double radius;
 private String color;

 // 1st constructor, which sets both radius and color to default
 public Circle() {
 radius = 1.0;
 color = "red";
 }

 // 2nd constructor with given radius, but color default
 public Circle(double r) {
 radius = r;
 color = "red";
 }
 // 3rd constructor with given radius, but color default
 public Circle(double r, String c) {
 radius = r;
 color = c;
 }

 // A public method for retrieving the radius
       public double getRadius() {
 return radius;
 }

 // A public method for computing the area of circle
 public double getArea() {
    double area = radius*radius*Math.PI;
 return area;
 }
 protected void setColor(String color){
     this.color = color;
 }
   protected void setRadius(double radius){
    this.radius=radius;
 }
 protected String getColor(){
    return color;
 }


}
