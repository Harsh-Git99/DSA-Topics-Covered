package BinarySrc;
//contains ceiling and floor program
public class CeilingNum {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};

        int[] arr2 = {13, 24,32,43,54,65,76,78,89};

        int target1 = 19;
        int target2 = 11;

         int Cans = ceiling(arr, target1);

         int Fans = floor(arr, target1);
        System.out.println("The ceiling value of the given target "+ target1+ " is "+Cans);

        System.out.println("The floor value of the given target "+ target1+ "  is "+Fans);


        int Cans2 = ceiling(arr2, target2);

        int Fans2 = floor(arr2, target2);

        System.out.println("The ceiling value of the given target "+ target2+ " is "+Cans2);

        System.out.println("The floor value of the given target "+ target2+ "  is "+Fans2);
    }

    static int ceiling(int[] arr, int target){


        //what if the target num is larger than largest num in the array
        if (target > arr[arr.length-1]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end -start)/2;
            if (arr[mid] > target){
                end = mid -1;
            } else if (arr[mid] < target) {

                start = mid+1;
            }
            else if (arr[mid] == target){
                return arr[start];
            }
        }
        return  arr[start];
    }
    static int floor(int[] arr, int target){

        if (target < arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        while (start<=end){

            int mid = start + (end -start)/2;

            if (arr[mid] < target){
                start = mid +1;
            } else if (arr[mid]>target) {
                end = mid-1;
            } else if (arr[mid] == target) {
                return arr[start];
            }

        }
        return arr[end];
    }

}

