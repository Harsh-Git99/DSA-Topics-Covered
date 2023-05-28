package Arrays.Easy;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,12};

        removeZero(arr);
    }

    static void removeZero(int[] arr){
        int i = 0;
        int j = 0;
        while(i< arr.length){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
            i++;
        }
        while(j != arr.length){
            arr[j]=0;
            j++;
        }
    }
}
