package Arrays_Revision;

public class rotationCount {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        System.out.println(noOfRotationCounts(arr));
    }

    static int noOfRotationCounts ( int[] arr){
        int pivot = pivotIndex(arr);

        return (pivot+1 % arr.length);
    }



    static  int pivotIndex(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if (mid < end && arr[mid] > arr[mid+1]){
                return mid;
            } else if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }else if(arr[start] >= arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
