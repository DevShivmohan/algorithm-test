package com.algotest.sort;

import com.algotest.node.LinkedList;
import com.algotest.node.Node;

public class InsertionSort {
    /**
     * insertion sort using generic linked list
     * @param linkedList
     */
    public void insertionSort(LinkedList linkedList){
        if(linkedList==null)
            return;
        Node currentNode=linkedList.head,index=null;
        Comparable temp;
        while (currentNode!=null){
            index=currentNode.nextNode;
            while (index!=null){
                if(currentNode.data.compareTo(index.data)>0){
                    temp=index.data;
                    index.data=currentNode.data;
                    currentNode.data=temp;
                }
                index=index.nextNode;
            }
            currentNode=currentNode.nextNode;
        }
    }
}
