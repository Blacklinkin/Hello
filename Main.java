package com.company;

        import com.company.LinkedList.Node;

public class Main {

    public static void main(String[] args)
    {
        Node n = new Node(9);
        Node first = new Node(19,n);
        System.out.println(n.getItem());
        System.out.println(first.getItem());
        first.getNext();
        System.out.println(first.getItem());

    }
}
