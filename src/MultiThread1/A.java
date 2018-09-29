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
public class A extends Thread {
    
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("hi");
           try{ Thread.sleep(10);}catch(Exception e){}
        }
    }
    
}
