/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThread2;

/**
 *
 * @author ASHIM
 */
public class Hellow  implements Runnable{
    
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("Hellow");
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                
            }
        }
    }
    
}
