package BinarySrc;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {-1,-2,3,4,55,667,7675,8888,9856};
        int[] DeArr = {3545,2344,1224,1000,999,943,834};

        int Atarget = 3;
        int Dtarget = 3545;
        System.out.println( AccBinarySearch(arr, Atarget));

        System.out.println(DeBinarySearch(DeArr,Dtarget));

    }

    // return the index

    static int AccBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end -start)/2;
            if (arr[mid] > target){
                end = mid -1;
            } else if (arr[mid] < target) {

                start = mid+1;
            }else {
                 return mid;
            }
        }
        return -1;
    }

    static int DeBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end -start)/2;
            if (arr[mid] < target){
                end = mid -1;
            } else if (arr[mid] > target) {

                start = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}