/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThread1;

/**
 *
 * @author ASHIM
 */
public class ThreadDemo {
    public static void main(String args[]){
        A obj1=new A();
        B obj2=new B();
        obj1.start();
        obj2.start();
    }
    
}
