/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction_01;

/**
 *
 * @author ASHIM
 */
public class D implements B,C{

    @Override
    public void foo() {
        System.out.println("Hi,I'm Ashim Chakraborty");
    }

    @Override
    public void ressult() {
        System.out.println("Yes,Result has published");
    }
    
}
