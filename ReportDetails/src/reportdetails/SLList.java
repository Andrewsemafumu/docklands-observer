/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reportdetails;

public class SLList implements LinearListInterface {
    private SlNode head;
    private int iSize;
    private SlNode currNode;
    private SlNode prevNode;

    public SLList() {
        head = null;
        iSize = 0;
        currNode = null;
        prevNode = null;
    }

    @Override
    public boolean isEmpty() {
        return iSize == 0;
    }

    @Override
    public int size() {
        return iSize;
    }

    @Override
    public void add(int iPosition, Object theElement) {
        if (iPosition == 1) {
            SlNode newNode = new SlNode(theElement, head);
            head = newNode;
        } else {
            setCurrent(iPosition);
            SlNode newNode = new SlNode(theElement, currNode);
            prevNode.setNext(newNode);
        }
        iSize = iSize + 1;
    }

    @Override
    public void add(Object theElement) {
        SlNode newNode = new SlNode(theElement, null);
        if (head == null) {
            head = newNode;
        } else {
            setCurrent(iSize);
            currNode.setNext(newNode);
        }
        iSize = iSize + 1;
    }

    @Override
    public Object get(int iPosition) {
        setCurrent(iPosition);
        return currNode;  // Returns the node, not just the data
    }

    @Override
    public void remove(int iPosition) {
        if (iPosition < 1 || iPosition > iSize) {
            return;
        }

        if (iPosition == 1) {
            head = head.getNext();
        } else {
            setCurrent(iPosition);
            if (prevNode != null) {
                prevNode.setNext(currNode.getNext());
            }
        }
        iSize = iSize - 1;
    }

    private void setCurrent(int iPosition) {
        int iCount;
        prevNode = null;
        currNode = head;
        for (iCount = 1; iCount < iPosition; iCount++) {
            if (currNode == null) {
                break;
            }
            prevNode = currNode;
            currNode = currNode.getNext();
        }
    }

    @Override
    public void printList() {
        SlNode tempNode = head;
        while (tempNode != null) {
            Object data = tempNode.getData();
            if (data != null) {
                System.out.println(data.toString());
            }
            tempNode = tempNode.getNext();
        }
    }
}