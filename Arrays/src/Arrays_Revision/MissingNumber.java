package Arrays_Revision;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};

        System.out.println(missingNum(arr));
    }

    static  int missingNum (int[] arr){
        int n = arr.length;
        int Sum=0;
        int sum_of_Nums = n*(n+1)/2;

        for (int j : arr) {
            Sum += j;
        }
        return  sum_of_Nums - Sum;
    }
}
