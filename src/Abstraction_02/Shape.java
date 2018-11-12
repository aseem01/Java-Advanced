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
public abstract class Shape {
    String color;
    //This are abstract method.For that have no method body;
    abstract double area();
    public abstract String toString();
    
    //Abstract class can have constructor;
    public Shape(String color){
        System.out.println("Shape constructor called");
        this.color=color;
    }
    //This is a concrete method;
    public String getColor(){
        return color;
    }
    
}
