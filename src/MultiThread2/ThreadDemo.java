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
public class ThreadDemo {
    public static void main(String agrs[]){
    Runnable obj1=new Hi();
    Runnable obj2=new Hellow();
    Thread t1=new Thread(obj1);
    Thread t2=new Thread(obj2);
    t1.start();
    try{
        Thread.sleep(10);
    }catch(Exception e){
        
    }
    t2.start();
    }
}
