package Arrays.Easy;

public class MaxConsecutive {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(MaxNumberOfOnes(arr));
    }

    static int MaxNumberOfOnes(int[] arr){
        int count = 0;
        int i = 0;
        int max = 0;
        while(i < arr.length){
            if(arr[i] == 1){
                count++;
                if(count > max){
                    max = count;

                }
            }else count = 0;
            i++;

        }
        return max;
    }
}
