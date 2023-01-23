package com.algotest.node;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>>{
    public Node nextNode;
    public Node prevNode;
    public T data;

    public Node(T data){
        this.data=data;
    }

    private T getT(){
        return data;
    }

    @Override
    public int compareTo(Node<T> o) {
        return getT().compareTo(o.getT());
    }
}
