/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reportdetails;

public class SlNode {
    private Object data;
    private SlNode next;
    
    public SlNode(Object data, SlNode next) {
        this.data = data;
        this.next = next;
    }
    
    public Object getData() {
        return data;
    }
    
    public void setData(Object data) {
        this.data = data;
    }
    
    public SlNode getNext() {
        return next;
    }
    
    public void setNext(SlNode next) {
        this.next = next;
    }
}