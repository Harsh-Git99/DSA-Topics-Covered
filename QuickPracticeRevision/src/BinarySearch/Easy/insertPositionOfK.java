package BinarySearch.Easy;

public class insertPositionOfK {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5};

        System.out.println(insertPos1(arr,2));
    }

    static int insertPos1(int[] arr, int k){
        int st = 0;
        int end = arr.length-1;
        while(st <= end) {
            int mid = st + (end - st) / 2;

            if(arr[mid] > k ){
                end = mid-1;
            }else if (arr[mid] < k){
                st = mid+1;
            }else return mid;
        }
        if(st > end) {
            return st;
        }
        return end;

    }


            //optimised solution number 2

    static int insertPos(int[] arr, int k){
        int st = 0;
        int end = arr.length-1;
        while(st <= end){
            int mid = st + (end - st)/2;

            if(arr[mid] == k ){
                return mid;
            }else if(k < arr[mid]){
                if(mid == 0){
                    return 0;
                }
                else if(k > arr[mid-1]){
                    return mid;
                }else end = mid -1;
            }else {
                if(mid == arr.length-1){
                    return arr.length;
                }
                else if(k < arr[mid+1]){
                    return mid+1;
                }else st = mid +1;
            }
        }
        return -1;
    }
}
