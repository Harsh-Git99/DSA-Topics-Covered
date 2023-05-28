package BinarySearch.Medium;

public class rotatedSortedArrayBS {
    public static void main(String[] args) {
        int[] arr = {1,3};

      //  System.out.println(findPeak(arr));

        System.out.println(findElement(arr,0));

    }

    static int findElement(int[] arr, int target){


        //find peak element
        int peak = findPeak(arr);
        if(peak == -1){
            return binarySearch (arr, 0, arr.length-1, target);
        }

        if(arr[peak] == target){
            return peak;
        } else if (target < arr[0]) {
            return binarySearch(arr,peak+1, arr.length-1, target);
        }else return binarySearch(arr,0, peak, target);


    }


    static int findPeak(int[] arr){
        int st = 0;
        int end = arr.length-1;
        while(st < end){
            int mid = st + (end - st)/2;
            if(arr[mid] > arr[mid+1] ) return mid;
            else if(mid >0  && arr[mid] < arr[mid-1] ) return mid-1;
            else if(arr[st] >= arr[mid]) end = mid-1;
            else if(arr[st] < arr[mid]) st = mid+1;
            }
        return -1;
    }

    static int binarySearch (int[] arr,int st, int end ,int target){

        while(st <= end){
            int mid= st + (end - st)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] > target) {
                end = mid-1;
            }else st = mid+1;
        }
        return -1;
    }

}
