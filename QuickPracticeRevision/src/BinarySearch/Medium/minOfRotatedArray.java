package BinarySearch.Medium;

public class minOfRotatedArray {
    public static void main(String[] args) {
        int[] arr = {11,13,15,17};

        System.out.println(findMin(arr));
    }

    static int findMin(int[] arr){


        int pivot = findPivot(arr);

        if(pivot == -1) return arr[0];
        else return arr[pivot+1];

    }

    static int findPivot(int[] arr){
        int st = 0;
        int end = arr.length-1;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(arr[mid] > arr[mid+1]) return mid;
            else if (arr[mid] < arr[mid-1]) return mid-1;
            else if(arr[st] >= arr[mid]) end = mid-1;
            else if(arr[st] < arr[mid]) st = mid+1;
        }
        return -1;
    }
}

