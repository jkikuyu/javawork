
package com.zeno.projects.animate;

import java.util.Scanner;

/**
 *
 * @author Lecturer D.M
 * Declare and allocate an instance of class Circle called  c1
 * with default radius and color
 */
public class TestCircle {
 public static void main(String[] args) {
    Circle c1 = new Circle();
    String color = "";
    // Use the dot operator to invoke methods of instance c1.
    System.out.println("The circle has radius of\t"  
    + c1.getRadius() + "\t and area of\t" + c1.getArea());

    // Declare and allocate an instance of class circle called c2 
    // with the given radius and default color
    Circle c2 = new Circle(2.0);
    // Use the dot operator to invoke methods of instance c2.
    System.out.println("The circle has radius of "
    + c2.getRadius() + " and area of " + c2.getArea());
    // c3 object shall be used to set the color obtained from the terminal

    Circle c3 = new Circle(2.0, color);

    Scanner s = new Scanner(System.in);
    System.out.println("Enter color of circle");
    c3.setColor(s.nextLine());
    System.out.println("Enter radius");
    c3.setRadius(s.nextDouble());

    System.out.println("The circle has a color" +" " + c3.getColor()+" radius of "
    + c3.getRadius() + " and area of " + c3.getArea());
  }
}    
