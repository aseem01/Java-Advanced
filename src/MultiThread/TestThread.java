/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThread;

/**
 *
 * @author ASHIM
 */
public class TestThread {
    public static void main(String args[]){
        ThreadDemo t1=new ThreadDemo("Thread-1");
        t1.start();//Another thread t1 is start;
        
        ThreadDemo t2=new ThreadDemo("Thread-2");
        t2.start();
    }
    
}
