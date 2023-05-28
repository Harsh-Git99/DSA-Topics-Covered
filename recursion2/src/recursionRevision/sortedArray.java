package recursionRevision;

public class sortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,6,7};

        System.out.println(isSortedR(arr,0));
    }

    static boolean isSortedR(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSortedR(arr, i+1);

    }



    static boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
