/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author ASHIM
 */
public class Node {

    int data;
    Node link;

    /* constructor*/
    public Node() {
       // System.out.println("I'm calling");
        link = null;
        data = 0;
    }

    /* constructor */
    public Node(int d, Node n) {
//        System.out.println("data : "+data);
//        System.out.println("link : "+link);
        data = d;
        link = n;
    }

    /* Function to set data to next Node */
    public void setLink(Node n) {
        link = n;
    }

    /* Function to set data to current Node */
    public void setData(int d) {
        data = d;
    }

    /* Function to get link to next node */
    public Node getLink() {
        return link;
    }

    /* Function to get data from current Node */
    public int getData() {
        return data;
    }

}
