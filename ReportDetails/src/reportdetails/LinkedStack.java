/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reportdetails;

/**
 *
 * @author HP
 */

//This is the stack implementation and operates on the basis of LIFO ( Last In first out) 
//This will increase dynamically 
public class LinkedStack {
    private Node topNode; 
    private int size; 
    
    private class Node {
        Object data; 
        Node next; 
        
        public Node(Object data, Node next){
            this.data = data; 
            this.next = next; 
            
        }
        public Object getData(){
            return data; 
        }
    }
    public LinkedStack(){
        topNode=null;
        size=0;
    }
    public void push(Object element) {
        Node newNode = new Node(element, topNode);
        topNode = newNode;
        size++;
    }
    
    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        Object data = topNode.data;
        topNode = topNode.next;
        size--;
        return data;
    }
    
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
         return topNode.data;
    }
    //checks if the stack is empty 
    public boolean isEmpty() {
        return size == 0;
    }
    
    public int size() {
        return size;
    }
    
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node current = topNode;
        int index = 0;
        //traversing the stack from top to bottom 
        while (current != null) {
            array[index++] = current.data;
            current = current.next;
        }
        return array;
}
}

