package ArrayBasics;

import java.util.ArrayList;
import java.util.Arrays;

public class CovertArrytoListandListToArray {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
           list.add("Ram");
           list.add("Sham");
           list.add("Bhem");


        String[] arr = new String[list.size()];
        //Converting list to Array
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        System.out.println(Arrays.toString(arr));


        int[] arr2 = {3,8,2,5,6};

        ArrayList<Integer> list2 = new ArrayList<>();

        //Converting Array ot list
        for(int i: arr2)
        {
            list2.add(i);
        }

        System.out.println(list2);
    }
}
