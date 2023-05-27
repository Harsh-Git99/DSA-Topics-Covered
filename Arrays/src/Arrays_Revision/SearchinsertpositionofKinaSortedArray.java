package Arrays_Revision;

public class SearchinsertpositionofKinaSortedArray {
    public static void main(String[] args) {

        int [] arr= {-12 ,-11, -3, 5, 6, 15, 16, 18};
        int N = 8;
        int target = 2;

        System.out.println(searchInsertK(arr,N,target));
    }

    static int searchInsertK(int arr[], int N, int target) {


        int start = 0;
        int end = N-1;

        while(start <= end){
            int mid = start + (end - start )/2;
            if(arr[mid] > target){
                end = mid-1;
            }else if(arr[mid] < target) {
                start = mid+1;
            } else if (arr[mid] == target) {
                return mid;
            }
        }

        if(start>end){
            return start;
        }
        return end;
    }
}
