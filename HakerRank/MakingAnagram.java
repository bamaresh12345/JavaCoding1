package HakerRank;

public class MakingAnagram {

    public static int makingAnagram(String s1, String s2)
    {
        int[] ch = new int[26];

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        for (int i = 0; i < s1.length(); i++) {
            ch[s1.charAt(i)-'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            ch[s2.charAt(i) -'a']--;
        }

        int total=0;
        for (int i = 0; i < ch.length; i++) {

            if(ch[i]!=0) {
                total = total + Math.abs(ch[i]); // Math.abs(ch[i])  // *** IMP , this works when 2nd string is -1 , then it will counte one
                total = total +1; // this also works
            }
        }


        return total;
    }

    public static void main(String[] args) {

        String s1= "rate";
        String s2= "tars";

        System.out.println(makingAnagram(s1,s2));
    }
}
