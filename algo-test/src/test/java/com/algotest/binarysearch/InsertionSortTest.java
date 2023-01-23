package com.algotest.binarysearch;

import com.algotest.node.LinkedList;
import com.algotest.sort.InsertionSort;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InsertionSortTest {

    private static InsertionSort insertionSort;
    private static LinkedList<Integer> linkedList;

    @BeforeAll
    public static void initialize(){
        insertionSort=new InsertionSort();
        linkedList=new LinkedList<>();
        linkedList.addNode(12);
        linkedList.addNode(1);
        linkedList.addNode(20);
        linkedList.addNode(18);
        linkedList.addNode(5);
        linkedList.addNode(-5);
        linkedList.addNode(3);
        linkedList.addNode(8);
        linkedList.addNode(32);
        linkedList.addNode(30);
        linkedList.addNode(10);
    }

    @Test
    public void test1(){
        insertionSort.insertionSort(null);
    }

    @Test
    public void test2(){
        insertionSort.insertionSort(linkedList);
        System.out.println(linkedList);
        assert linkedList.verifyViaIndex(1)==1;
    }

    @Test
    public void test3(){
        assert linkedList.verifyViaIndex(32)==10;
    }

    @Test
    public void test4(){
        assert linkedList.verifyViaIndex(3)==2;
    }

    @Test
    public void test5(){
        assert linkedList.verifyViaIndex(8)==4;
    }

    @Test
    public void test6(){
        assert linkedList.verifyViaIndex(-5)==0;
    }

    @Test
    public void test7(){
        assert linkedList.verifyViaIndex(-4)==-1;
    }

    @Test
    public void test8(){
        assert linkedList.verifyViaIndex(5)==3;
    }

    @Test
    public void test9(){
        assert linkedList.verifyViaIndex(20)==8;
    }

    @Test
    public void test10(){
        assert linkedList.verifyViaIndex(30)==9;
    }
}
