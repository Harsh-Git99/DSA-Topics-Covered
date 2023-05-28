package BinarySearch.Medium;

public class rotatedSortedArray2 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1,1};
        int target= 2;

        System.out.println(isPresent(arr,target));
    }

    static boolean isPresent(int[] arr,int target){
        int st = 0 ;
        int end = arr.length-1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(arr[mid] == target) return true;

            //check if the left side is sorted
            if(arr[st] < arr[mid]){
                //yes, then check if the target exists in  left side or not.
                if(target >= arr[st] && target < arr[mid]){
                    end = mid-1;
                }else st = mid+1;
            }
            else if(arr[st] > arr[mid] ){     //check if the right side is sorted
                if(target >= arr[mid] && target < arr[end]){
                    st = mid+1;
                }else end = mid-1;
            }
            else st++;  //if the duplicate values exists then start removing from one side
        }
        return false;
    }
}
