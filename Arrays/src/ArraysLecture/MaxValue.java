package ArraysLecture;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {1,22,3,46,6};

        System.out.println(max(arr));

        System.out.println(RangeMax(arr, 0, 3));
    }

    static  int max(int[] arr){
        int max_item = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > max_item){
                max_item = arr[i];
            }
        }

        return max_item;
    }

    static int RangeMax (int[] arr, int start, int end){

        int max = arr[0];

        for (int i = start; i < end; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return  max;
    }

}
