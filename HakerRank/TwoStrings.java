package HakerRank;

import java.util.HashSet;
import java.util.Set;

public class TwoStrings {

    public static String twoStrings(String s1, String s2) {
        // Write your code here

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            set1.add(s1.charAt(i));
        }


        for (int i = 0; i < s2.length(); i++) {
            set2.add(s2.charAt(i));
        }

        set1.retainAll(set2); //*** IMP

        if (!set1.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }


    }

    public static void main(String[] args) {

        String s1 = "and";  // YES
        String s2 = "art";
        //String s1 = "ckm";  //NO
        //String s2 = "art";

        System.out.println(twoStrings(s1, s2));

    }

}
