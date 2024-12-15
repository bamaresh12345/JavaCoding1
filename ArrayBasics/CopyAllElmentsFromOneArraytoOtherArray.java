package ArrayBasics;

import java.util.Arrays;

public class CopyAllElmentsFromOneArraytoOtherArray {

    public static void main(String[] args) {

        int[] arr1 = {1,6,4,2,9,3};

        int[] arr2 = new int[arr1.length];

        for(int i=0; i<arr1.length; i++)
        {
            arr2[i] = arr1[i];
        }

        System.out.println(Arrays.toString(arr2));
    }
}
