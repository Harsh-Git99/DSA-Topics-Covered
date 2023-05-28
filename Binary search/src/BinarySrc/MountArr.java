package BinarySrc;

public class MountArr {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,5,3,1};

        int ans = PeakIndexMountArray(arr);
        System.out.println(ans);
    }

    static  int PeakIndexMountArray(int[] arr){
        int st =0;
        int end =arr.length-1;

        while(st < end){
            int mid = st+(end-st)/2;

            if (arr[mid] > arr[mid+1]){
                //you are in decreasing  part of array, this may be the ans but look in the LHS
                end =mid;
            } else if (arr[mid]< arr[mid+1]) {
                //you are in Increasing  part of array, this may be the ans but look in the RHS
                st = mid + 1;
            }

        }
        return st;
    }
}
