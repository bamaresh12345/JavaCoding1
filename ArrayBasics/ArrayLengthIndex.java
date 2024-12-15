package ArrayBasics;

import java.util.Arrays;

public class ArrayLengthIndex {

    public static void main(String[] args) {

        int arr[] = {6, 2, 7, 8, 3, 9, 4, 5};

        // Create an array of 5 integers
        int[] arr11 = new int[5];

        // Fill the entire array with the value 2


        System.out.println("Array Length : " + arr.length);  // length start with 1
        System.out.println("Array index : " + arr[0]);  // index starts with 0
        System.out.println("Array index : " + arr[-1]);  // index out of bound
        System.out.println("Array index : " + arr[10]);  // index out of bound

        // create different integers arrays
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {1, 2, 4, 3};

        Arrays.sort(arr);
        Arrays.toString(arr);
        Arrays.fill(arr11, 2);
        Arrays.equals(arr1, arr2); //true
        Arrays.equals(arr1, arr3); //false


        System.out.println(Arrays.toString(arr)); // to pint the array


        System.out.println("Array fill " + Arrays.toString(arr11));


    }
}
