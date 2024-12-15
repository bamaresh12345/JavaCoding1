package HakerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraysLeftRotation {


    public static List<Integer> rotLeft(List<Integer> a, int d) {

        // Write your code here
        List<Integer> list = new ArrayList<>();

        for(int i=0 ; i<a.size(); i++)
        {
            int k  = a.get((i+d) % a.size());   // IMP**** 4 % 5 = 4
            System.out.println(k);
            list.add(k);
        }
        System.out.println("after rotation" + list);
        return list;



    }
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        int d = a.size(); // * IMP size() is same as length starts with 1 to last element;
        System.out.println( "a.size() --> " + d);

        for (int i = 0; i < a.size(); i++) { // Arraylist also starts from 0 index
            System.out.println("print each element " + a.get(i)); // need to used get(i)

        }
      //  System.out.println(rotLeft(a,d));

        rotLeftReverseArray(a,d);

    }


    public static List<Integer> rotLeftReverseArray(List<Integer> a, int d) {

        List<Integer> list = new ArrayList<>();

        int len = a.size();
        int k=d;

        reverse(a,0,len-1);

        System.out.println(a);

        reverse(a,0,d-1);
        System.out.println(a);

        reverse(list,d,len-1);
        System.out.println(a);




        return list;
    }

    public static List<Integer> reverse(List<Integer> lst, int start, int end)
    {

        System.out.println("list--> " + lst);
        System.out.println(lst.get(start));
        System.out.println(lst.get(end-1));
        while(lst.get(start) > lst.get(end-1))
        {
            if(lst.get(start) > lst.get(end))
            {

                Collections.swap(lst,start,end);
                start++;
                end--;

            }
        }

        return lst;
    }
}
