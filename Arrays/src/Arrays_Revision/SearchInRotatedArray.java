package Arrays_Revision;

public class SearchInRotatedArray {
    public static void main(String[] args) {

        int[] arr = {};

        int target = 5;
        System.out.println( searchTarget(arr,target));
    }


    static  int searchTarget(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        int pivot = search_pivot(arr);

        if(arr[pivot] == target){
            return pivot;
        } else if (target <= arr[0]) {
           return binaryS(arr,target,pivot+1, arr.length);
        }else
            return binaryS(arr,target,0, pivot-1);
    }

    static int search_pivot(int[] arr){
        int s = 0;
        int e = arr.length-1;
        int pivot = 0;

        while(s < e){
            int mid = s + (e -s)/2;
            if(arr[mid] > arr[mid+1]){
                 pivot = mid;
            }
             if(arr[mid] < arr[mid-1]){
                pivot = mid-1;
            }
             if (arr[s] >= arr[mid]){
                e = mid ;
            }else s = mid+1;
        }
        return pivot;
    }


    static  int binaryS(int[]arr,int target, int start,int end){
        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < target ) {
                start = mid+1;
            }
            else end=mid-1;
        }
        return -1;
    }
}
