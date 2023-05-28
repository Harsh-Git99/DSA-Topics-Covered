package recursionRevision;

public class Palindrome {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};

        System.out.println(isPalinR(arr,0,arr.length-1));

    }
    static boolean isPalinR(int[] arr, int i , int  j ){

        if( i >j){
            return true;
        }
        if(arr[i] != arr[j]) return false;
        return isPalinR(arr,i+1,j-1);
    }


    static boolean isPalin(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while(i <= j){
            if(arr[i] != arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
