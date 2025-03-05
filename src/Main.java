/*
Java Encapsulation:

An object's encapsulation allows it to hide its data and methods.
It is one of the fundamental principles of object-oriented programming.
Java classes encapsulate the fields and methods that define an object's state and actions.
Encapsulation enables you to write reusable programs.
It also enables you to restrict access only to public features of an object.
Other fields and methods are private and can be used internally.

5. Write a Java program to create a class called Circle with a private instance variable radius.
Provide public getter and setter methods to access and modify the radius variable.
However, provide two methods called calculateArea() and calculatePerimeter() that return the
calculated area and perimeter based on the current radius value.
*/
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(1.0);
        System.out.println("Circle Details:");
        System.out.println("Radius: "+c.getRadius()+"cm\nArea: "+c.calculateArea()+"cm²\nPerimeter: "+c.calculatePerimeter()+"cm");
    }
}