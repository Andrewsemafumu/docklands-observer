/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reportdetails;

/**
 *
 * @author HP
 * 
 * 
 */
// This will implement  the queue interface using singly linked list 
public class LinkedQueue implements Queue {  
    private Node frontNode;  // reference to the front node of the queue  basically for deque operations 
    private Node rearNode;   
    private int size;
    
    private class Node {
        Object data;
        Node next;
        
        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
        
        public Object getData() {
            return data;
        }
    }
    
    public LinkedQueue() {
        frontNode = null;
        rearNode = null;
        size = 0;
    }
    
    @Override
    public void enqueue(Object element) {
        Node newNode = new Node(element, null);
        
        if (isEmpty()) {
            frontNode = newNode;
            rearNode = newNode;
        } else {
            rearNode.next = newNode;
            rearNode = newNode;
        }
        size++;
    }
    
    @Override
    public Object dequeue() {
        if (isEmpty()) {
            return null;
        }
        
        Object data = frontNode.data;
        frontNode = frontNode.next;
        
        if (frontNode == null) {
            rearNode = null;
        }
        
        size--;
        return data;
    }
    
    @Override
    public Object front() {
        if (isEmpty()) {
            return null;
        }
        return frontNode.data;
    }
    
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    
    @Override
    public int size() {
        return size;
    }
    
    // Print queue contents
    public void printQueue() {
        Node temp = frontNode;
        while (temp != null) {
            System.out.println(temp.data.toString());
            temp = temp.next;
        }
    }
    
    //converts the queue to an array 
    
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node temp = frontNode;
        int index = 0;
        //traverse an array 
        while (temp != null) {
            array[index++] = temp.data;
            temp = temp.next;
        }
        return array;
    }
}
