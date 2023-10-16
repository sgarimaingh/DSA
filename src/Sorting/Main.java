package Sorting;

import Binary_Search.FirstAndLastIndex;
import Binary_Search.SearchInSorted2dMatrix;
import Binary_Search.SearchInSortedRotatedArray;

public class Main {
    public static void main(String[] args) {

        //Sort 0 1 array
        System.out.println("\nSorted 0 1 array: ");
        Sort01 sort01 = new Sort01();
        sort01.sort();

        //Sort 0 1 2 array
        System.out.println("\nSorted 0 1 2 array: ");
        Sort012 sort012 = new Sort012();
        sort012.sort012();

        // counting sort
        System.out.println("\n Count sort:");
        CountSort cs = new CountSort();
        cs.countSort();

        // radix sort
        System.out.println("\n Radix sort:");
        RadixSort rs = new RadixSort();
        rs.radixSort();


    }
}