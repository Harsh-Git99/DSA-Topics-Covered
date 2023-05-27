package Arrays_Revision;

public class CheckArrayIsSortedAndRotated {
    public static void main(String[] args) {
        int[] arr= {4,5,1,2,3};

        //System.out.println(pivotIndex(arr));

        System.out.println(check(arr));

    }

    static boolean check(int[] arr) {
        int k = 0;
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] > arr[(i+1)%arr.length]){
                k++;
            }
            if(k >1){
                return false;
            }
        }
        return true;
    }



    //works for 169 cases out of 170
    static  boolean isSortedAndRotated(int[] arr){



        int pivot = pivotIndex(arr);

        if(pivot == -1){
            // pivot can only be -1 when the array doesn't seem to rotated, i.e. when pivot is on the last index

            // check if the array is sorted
            return  isSorted(arr, 0, arr.length);

        } else {
            if(isSorted(arr, 0,pivot) && isSorted(arr, pivot+1,arr.length)){
                if(arr[0] >= arr[arr.length-1]){
                    return true;
                }
            }
        }
        return false;
    }

    static  int pivotIndex (int[] arr){

        int st=0;
        int end = arr.length-1;

        while(st<=end){
            int mid = st + (end- st)/2;

            if(mid<end && arr[mid] > arr[mid+1] ){
                return mid;
            } else if (mid>st && arr[mid] < arr[mid-1]) {
                return mid-1;
            } else if (arr[mid]==arr[st] && arr[mid] == arr[end]) {
                //check if either of the start or the end is pivot.
                if(st < arr.length-1 && arr[st] > arr[st+1]){
                    return st;
                }
                st++;
                if(end > 0 && arr[end] < arr[end -1]){
                    return end-1;
                }
                end--;
            }

            //left side is sorted then the pivot is on right side

            else if (arr[st] < arr[mid] || (arr[st] == arr[mid] && arr[mid]>arr[end])) {
                st=mid+1;
            }else end=mid-1;
        }
        return -1;
    }


    static  boolean isSorted(int[] arr, int st, int end){

        for (int i = st; i < end; i++) {
            if(i < end-1 && arr[i] > arr[i +1]){
                return false;
            }
        }
        return true;
    }
}
