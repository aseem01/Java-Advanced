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
public class linkedList {

    Node start;
    Node end;
    int size;

    /*constructor*/
    public linkedList() {
        start = null;
        end = null;
        size = 0;
    }

    /* Function to check if list is empty*/
    public boolean isEmpty() {
        return start == null;
    }

    /* Function to get size of list */
    public int getSize() {
        return size;
    }

    /* Function to insert an element at begining */
    public void insertAtStart(int val) {
        // System.out.println("start : "+start);
        Node nptr = new Node(val, null);
//        System.out.println("after start : "+start);
//        System.out.println("data : "+nptr.data);
//        System.out.println("link : "+nptr.link);

        size++;
        if (start == null) {
            start = nptr;
            end = start;
        } else {
            nptr.setLink(start);
            start = nptr;
        }
    }

    public void display() {
        System.out.print("Single Linked List = ");
        if (size == 0) {
            System.out.println("empty\n");
            return;
        }
        if (start.getLink() == null) {
            System.out.println(start.getData());
            return;
        }

        Node ptr = start;
        // System.out.println(start.getData()+"->");
        while (ptr.getLink() != null) {
            System.out.print(ptr.getData() + " ");
            ptr = ptr.getLink();
        }
        System.out.println(ptr.getData());
    }
}
