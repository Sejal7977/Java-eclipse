package com.tnsif.inheritance;

//Multilevel Inheritance

//Base class
class Shape {
 // Data variable
 String color;

 // Constructor
 Shape(String color) {
     this.color = color;
 }

 // Method
 void draw() {
     System.out.println("Drawing a generic shape with color: " + color);
 }
}

//Derived class 1
class TwoDShape extends Shape {
 // Additional data variable
 int sides;

 // Constructor
 TwoDShape(String color, int sides) {
     super(color);
     this.sides = sides;
 }

 // Additional method
 void displaySides() {
     System.out.println("Number of sides: " + sides);
 }

 // Overridden method
 void draw() {
     System.out.println("Drawing a 2D shape with color: " + color);
 }
}

//Derived class 2
class Triangle extends TwoDShape {
 // Additional data variable
 double base;
 double height;

 // Constructor
 Triangle(String color, int sides, double base, double height) {
     super(color, sides);
     this.base = base;
     this.height = height;
 }

 // Overridden method
 void draw() {
     System.out.println("Drawing a triangle with color: " + color);
 }

 // Additional method
 double calculateArea() {
     return 0.5 * base * height;
 }
}

public class TestInheritance {
 public static void main(String[] args) {
     // Create an object of the derived class Triangle
     Triangle myTriangle = new Triangle("Red", 3, 5.0, 7.5);

     // Access methods and variables from the base class Shape
     myTriangle.draw();

     // Access methods and variables from the intermediate class TwoDShape
     myTriangle.displaySides();

     // Access methods and variables from the derived class Triangle
     myTriangle.draw();
     double area = myTriangle.calculateArea();
     System.out.println("Area of the triangle: " + area);
 }
}

