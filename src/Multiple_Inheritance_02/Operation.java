/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multiple_Inheritance_02;

/**
 *
 * @author ASHIM
 */
public class Operation extends Color implements Crow,Penguin {

    @Override
    public void eat() {
        System.out.println("Crow are usefull animal");
    }

    @Override
    public void fly() {
        System.out.println("Penguin can fly in sky");
    }
    public void res()
    {
        System.out.println("yes,you're successfully done everything");
    }
    
    public static void main(String []args){
        Operation obj=new Operation();
        obj.eat();
        obj.identification();
        obj.fly();
        obj.res();//If same method name in superclass.when subclass only implement his method;
        obj.res();//Subclsas Implements his own class instead of SuperClass;
    }
    
}
