package ArrayBasics;

public class FindCommonElementsfromTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {20,30,32,100,199,201,500};
        int[] arr2 = {600,500,30,201,299,900,901};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i] == arr2[j])
                {
                    System.out.print("****" +arr1[i]);
                    break;
                }
            }

        }
    }
}
