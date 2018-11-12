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
public class Main {
    public static void main(String [] args){
        Shape s1=new Circle("Red",2.2);
        Shape s2=new Rectangle("yellow",2,4);
        
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
