package com.algotest.binarysearch;

import com.algotest.sort.QuickSort;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QuickSortTest {
    private int[] arr1={12,34,35,10,65,2,67,89,9,92,16,107,109,111,12,230,24};
    private QuickSort quickSort=new QuickSort();

    @Test
    public void test1(){
        quickSort.quickSort(arr1,0,arr1.length-1);
        assert arr1[0]<=arr1[1];
    }

    @Test
    public void test2(){
        quickSort.quickSort(arr1,0,arr1.length-1);
        assert arr1[1]<=arr1[2];
    }

    @Test
    public void test3(){
        quickSort.quickSort(arr1,0,arr1.length-1);
        assert arr1[2]<=arr1[3];
    }

    @Test
    public void test4(){
        quickSort.quickSort(arr1,0,arr1.length-1);
        assert arr1[3]<=arr1[4];
    }

    @Test
    public void test5(){
        quickSort.quickSort(arr1,0,arr1.length-1);
        assert arr1[4]<=arr1[5];
    }

    @Test
    public void test6(){
        quickSort.quickSort(arr1,0,arr1.length-1);
        assert arr1[5]<=arr1[6];
    }

    @Test
    public void test7(){
        quickSort.quickSort(arr1,0,arr1.length-1);
        assert arr1[7]<=arr1[8];
    }

    @Test
    public void test8(){
        quickSort.quickSort(arr1,0,arr1.length-1);
        assert arr1[arr1.length-2]<=arr1[arr1.length-1];
    }

    @Test
    public void test9(){
        quickSort.quickSort(arr1,0,arr1.length-1);
        assert arr1[1]<=arr1[arr1.length-1];
    }

    @Test
    public void test10(){
        quickSort.quickSort(arr1,0,arr1.length-1);
        assert arr1[2]>=arr1[0];
    }
}
