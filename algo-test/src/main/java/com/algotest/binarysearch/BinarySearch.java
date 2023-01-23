package com.algotest.binarysearch;

public class BinarySearch {
    /**
     *
     * @param array
     * @param key
     * @return index of matched key if not then return -1 index [means not found]
     */
    public static int binarySearch(int[] array,int key){
        int first=0;
        int last=array.length-1;
        int midPoint=(first+last)/2;
        while (first<=last){
            if(array[midPoint]==key)
                return midPoint;
            else if(key>array[midPoint])
                first+=1;
            else
                last-=1;
            midPoint=(first+last)/2;
        }
        return -1;
    }
}
