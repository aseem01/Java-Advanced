/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multiple_Inheritance_01;

/**
 *
 * @author ASHIM
 */
public class ImplementInterface  implements InterfaceA,InterfaceB,InterfaceC{

    @Override
    public void doSomething() {
        System.out.println("Yes,I'm here man.");
    }
    
    public static void main(String []args){
        InterfaceA objA=new ImplementInterface();
        InterfaceB objB=new ImplementInterface();
        InterfaceC objC=new ImplementInterface();
        objA.doSomething();
        objB.doSomething();
        objC.doSomething();
    }

    
    
}
