package Arrays.ArraysEasy;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6};
        int target = 6;
        System.out.println(LiSearch(arr,target));
    }

    static int LiSearch (int[] arr, int target ){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
