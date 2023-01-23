package com.algotest.node;
public class LinkedList<T extends Comparable<T>>{
    /* root node */
    public Node head;
    /* leaf node */
    public Node tail;
    private long length;

    /**
     * add a new node
     * @param data
     */
    public void addNode(T data){
        Node node=new Node<T>(data);
        if(length==0){
            head=node;
        }
        else {
            tail.nextNode=node;
            node.prevNode=tail;
        }
        tail=node;
        length++;
    }

    /**
     * deletion from last node [LIFO]
     */
    public void remove(){
        if(length==1){
            head=null;
            tail=null;
        }
        else {
            tail=tail.prevNode;
            tail.nextNode=null;
        }
        length--;
    }

    public long length(){
        return length;
    }

    /**
     * using forward traversal
     * @return
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder("{");
        Node tempNode=head;
        while (tempNode.nextNode!=null){
            stringBuilder.append(tempNode.data).append(",");
            tempNode=tempNode.nextNode;
        }
        stringBuilder.append(tempNode.data).append("}");
        return stringBuilder.toString();
    }

    public int verifyViaIndex(T data){
        Node tempNode=head;
        int index=0;
        while (tempNode!=null){
            if(data.compareTo((T) tempNode.data)==0)
                return index;
            index++;
            tempNode=tempNode.nextNode;
        }
        return -1;
    }

}
