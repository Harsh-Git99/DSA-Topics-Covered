package Arrays_Revision;

public class DuplicateRotatedSearch {
    public static void main(String[] args) {
        int[] arr= {2};
        int target = 9;

        System.out.println(  findIndexOfTarget(arr, target));

    }

    static int findIndexOfTarget ( int[] arr, int target){
        int pivot = findPivot(arr);

        if(arr[pivot]==target){
            return pivot;
        } else if (arr[0] >= target) {
            return binaryS(arr, target, pivot+1,arr.length);
        }
        else  return binaryS(arr, target, 0, pivot-1);

    }


    static  int findPivot(int[] arr){
        int s = 0;
        int e = arr.length-1;

        while(s<e){
            int mid = s + (e-s)/2;

            if(mid < e && arr[mid] > arr[mid+1]){
                return mid;
            } else if (mid > s  && arr[mid] < arr[mid-1]) {
                return mid-1;
            }

            //if element at start, end and at mid are same then ignore the duplicates

            else if(arr[mid] == arr[s] && arr[mid] == arr[e]){

                //check if these start and end are pivot or not

                if(arr[s] > arr[s+1]){
                    return s;
                }
                s++;
                if(arr[e] < arr[e-1]){
                    return e-1;
                }
                e--;
            }
            else if (arr[s] < arr[mid] || (arr[s] == arr[mid] && arr[mid] > arr[e])) {    //left side is sorted, so pivot is on the right
                s = mid+1;
            }
            else e = mid-1;
        }
        return -1;
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
