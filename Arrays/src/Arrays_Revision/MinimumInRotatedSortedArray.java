package Arrays_Revision;

public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,1,2};

        System.out.println(getSmallest(arr));
    }

    static  int getSmallest (int[] arr){

        int pivot = findPivot(arr);

        if(pivot == -1){
            return arr[0];
        }else
            return arr[((pivot % arr.length)+1)] ;

    }

    static  int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int  mid = start + (end-start)/2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid  ;
            } else if (mid > start && arr[mid] < arr[mid-1]) {
                return (mid-1) ;
            } else if (arr[start] < arr[mid]) {
                start = mid +1;
            }else end = mid - 1;
        }
        return -1  ;
    }
}
