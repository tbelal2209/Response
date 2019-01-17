package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr1 = {-20, 3, 15, 81, 432};
        int index = Binary.binarySearch(arr1, -20);
        System.out.println(index);
        index = Binary.binarySearch(arr1, 431);
        System.out.println(index);
        index = Binary.binarySearch(arr1,53);
        System.out.println(index);
    }
}
