package CyclicSort;

public class DuplicateNumber {
    public static void main(String[] args) {

        int [] arr = {3,1,3,4,2};

       int  ans =   SearchingDuplicateNums(arr);
        System.out.println(ans);
    }
    static int SearchingDuplicateNums ( int []arr){
        int last = arr.length;
        int i = 0;
        while (i< last){
            int correct = arr[i]-1;
            if (arr[i]!= arr[correct]){
                swap(arr, i, correct);
            }
            else
                i++;
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!= index+1){
                return arr[index];
            }
        }

        return -1;
    }

    static void swap (int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second] = temp;
    }
}
