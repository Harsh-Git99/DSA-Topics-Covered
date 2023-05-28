package recursionRevision;

public class RatatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int k = 10;


        System.out.println(rotatedBinarySearch(arr,k));
    }

    static int rotatedBinarySearch(int[] arr,int k ){
        int pivotIndex = findPivot(arr);

        if(arr[pivotIndex] == k)return pivotIndex;

        if(pivotIndex == -1){
            return binarySearch(arr,k,0,arr.length-1);
        }
        if(k >= arr[0]){
            return binarySearch(arr,k,0,pivotIndex);
        }
        return binarySearch(arr, k, pivotIndex + 1, arr.length - 1);
    }

    static int findPivot (int[] arr){
        int  s = 0;
        int ed = arr.length-1;

        while (s<=ed){
            int  mid = s + (ed - s)/2;

            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) {
                return mid;
            } else if (arr[s] >= arr[mid]) {
                ed = mid-1;

            }else s = mid+1;
        }
        return -1;
    }

    static int binarySearch(int[] arr,int k , int s, int e){

        while (s <= e){
            int mid  = s + (e-s)/2;

            if(arr[mid] == k){
                return mid;
            }
            else if(arr[mid] > k){
                e = mid -1;
            }else  s = mid+1;
        }
        return -1;
    }
}
