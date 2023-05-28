package BinarySrc;

public class SearchInMount {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;

        int peak = peakIndexInMountArray(arr);
        int firstTry = OrderAgosticBi_Search(arr, target, 0, peak);

        if (firstTry != -1){
            System.out.println("The target "+target+" lies at the array index "+ firstTry);
        }
        int secondTry = OrderAgosticBi_Search(arr, target, peak+1, arr.length-1);
        System.out.println("The target "+target+" lies at the array index "+secondTry);

       // System.out.println(peak);

        //int firstTry = SearchInMountArray(arr,target, );
    }


    static int peakIndexInMountArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }

        }
        return start;
    }


    static int OrderAgosticBi_Search(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start]<arr[end];

        while (start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid]< target) {
                    start = mid+1;

                }
            }
        }
        return -1;
    }
}


