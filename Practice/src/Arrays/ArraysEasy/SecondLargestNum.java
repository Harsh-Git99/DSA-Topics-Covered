package Arrays.ArraysEasy;

public class SecondLargestNum {
    public static void main(String[] args) {

        int [] arr = {42 ,28, 43, 26, 65, 60, 54, 51, 35, 42, 48, 33, 40, 58, 38, 64, 47, 44, 49, 46, 25, 57, 39, 55, 45, 29, 32, 61, 53, 31, 36, 56, 63, 30, 52, 27, 34, 50, 41, 37, 66, 62, 59};
        int size = arr.length;

        //Both the solutions are valid for repetition of elements in the array

        //less optimized solution
        System.out.println(SecondLargest(arr, size));

        // more optimized solution with time Complexity = constant;
       System.out.println(getSecondLargest(arr, size));
    }

    static int SecondLargest (int [] arr, int size) {
        int largest = getMax(arr,size);
        int sec=-1;

        for (int i = 0; i < size; i++) {
            if(arr[i] != largest){
                if(sec == -1){
                    sec=i;
                }
                else if(arr[i]>arr[sec]){
                    arr[sec] = arr[i];
                }
            }
        }if(sec ==-1){
            return -1;
        }
        return arr[sec];
    }


    static int getMax ( int [] arr, int n){
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    // more optimized solution with time Complexity = constant;

    static int getSecondLargest( int [] arr, int n){
        int sLrgt =  -1, lrgt = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] > arr[lrgt]){
                sLrgt = lrgt;
                lrgt = i;
            }
            //(arr[i] == arr[lrgt]) -> ignore
            else if ((arr[i] != arr[lrgt])) {
                if(sLrgt == -1 || arr[i] > arr[lrgt]){
                  sLrgt = i;
            }
        }
        }
        if(sLrgt ==-1){
            return -1;
        }
        return arr[sLrgt];
    }
}
