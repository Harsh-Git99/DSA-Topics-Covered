package recursionRevision;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 7;

        System.out.println(binarysearch(arr,8,k));
    }

    static int binarysearch(int arr[], int n, int k) {
        // code here

       int ans =  search(arr,k,0,n-1);
       return ans;

    }

    static int search ( int[] arr, int k, int s,int e){
        if(s >= e){
            return -1;
        }

        int mid = s+(e-s)/2;

        if(arr[mid] == k) return mid;
        else if (arr[mid] > k) {
            return search(arr, k, s,mid-1);
        }else return search(arr, k, mid+1,e);
    }
}
