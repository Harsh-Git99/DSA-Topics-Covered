package Arrays.ArraysEasy;

public class checkSorted {
    public static void main(String[] args) {
        int [] arr  = { 90, 80, 100, 70, 40, 30};
        System.out.println(check(arr));

    }
    static boolean check (int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
