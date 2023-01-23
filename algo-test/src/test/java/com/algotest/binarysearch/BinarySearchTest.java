package com.algotest.binarysearch;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BinarySearchTest {

    private int[] arr={12,34,35,55,65,66,67,89,90,92,106,107,109,111,120,230,240};
    private int[] arr1={};
    private int[] arr2={11};
    private int[] arr3={11,12,14};
    private static BinarySearch binarySearch=new BinarySearch();

    @Test
    public void test1(){
        assert binarySearch.binarySearch(arr,12) == 0;
    }

    @Test
    public void test2(){
        assert binarySearch.binarySearch(arr,240) == arr.length-1;
    }

    @Test
    public void test3(){
        assert binarySearch.binarySearch(arr,66) == 5;
    }

    @Test
    public void test4(){
        assert binarySearch.binarySearch(arr,111) == arr.length-4;
    }

    @Test
    public void test5(){
        assert binarySearch.binarySearch(arr1,240) == -1;
    }

    @Test
    public void test6(){
        assert binarySearch.binarySearch(arr2,240) == -1;
    }

    @Test
    public void test7(){
        assert binarySearch.binarySearch(arr2,11) == 0;
    }

    @Test
    public void test8(){
        assert binarySearch.binarySearch(arr3,20) == -1;
    }

    @Test
    public void test9(){
        assert binarySearch.binarySearch(arr3,12) == 1;
    }

    @Test
    public void test10(){
        assert binarySearch.binarySearch(arr3,14) == 2;
    }
}
