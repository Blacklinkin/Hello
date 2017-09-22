package com.company.LinkedList;

public class Node
{
    private Object item;
    private Node next;
    //begin constructor

    public Node()
    {
        next = null;
    }

    public Node(Object newItem) {
        item = newItem;
    }

    public Node(Object newItem, Node nextNode) {
        item = newItem;
        next = null;
    }
    //end constructor

    public void setItem(Object newItem) {
        item = newItem;
    }

    public Object getItem() {
        return item;
    }

    public void setNext(Node nextNode) {
        next = nextNode;
    }

    public Node getNext() {
        return next;
    }
}

