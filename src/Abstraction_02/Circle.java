/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction_02;

/**
 *
 * @author ASHIM
 */
public class Circle extends Shape{
    double radius;
    public Circle(String color,double radius){
        //calling shape constructor; 
        super(color);
        System.out.println("Circle constructor called");
        this.radius=radius;
    }

    @Override
    double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle color is "+super.color+""
                + "and area is : "+this.area();
    }
    
}
