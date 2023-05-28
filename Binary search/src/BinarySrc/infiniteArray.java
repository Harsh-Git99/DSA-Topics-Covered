package BinarySrc;

public class infiniteArray {
    public static void main(String[] args) {

        //
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10 ;

        System.out.println(ansRange(arr, target));

    }

    static  int ansRange (int[] arr, int target){
        //First find the range
        //first we start with the range of 2

        int start = 0;
        int end = 1;

        while (target > arr[end] ){
            int newStart = end+1;           // so that our next range could start from end + 1 index
            //double the box value
            // new End = previous end + sizeOfBox*2
            end = end + 2* (end - start + 1);
            start = newStart;

        }
        return BiSearch(arr, target, start,end);
    }

    static  int BiSearch(int[] arr, int target, int st, int end){
        while (st <=end){
            int mid = st+(end-st)/2;
            if (arr[mid] > target){
                end = mid-1;
            } else if (arr[mid]<target) {
                st = mid+1;
            }
            else
                return mid;
        }
        return  -1;
    }
}
