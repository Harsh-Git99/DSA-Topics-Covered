package Arrays.ArraysEasy;

public class FindSingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};

        System.out.println(find(arr));
    }
    static int find (int[] arr){

        int xor =0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor^arr[i];
        }
        return xor;
    }
}
