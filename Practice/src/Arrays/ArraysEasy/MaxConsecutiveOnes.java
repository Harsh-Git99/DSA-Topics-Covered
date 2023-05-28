package Arrays.ArraysEasy;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};

        System.out.println(MaxOnes(arr));
        System.out.println(findMaxConsecutiveOnes(arr));

    }

    //more optimum
    static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] ==1) {
                count++;
            } else {
                max = Math.max(count, max);     //checks if the new count is greater than max, if yes then update count value in max
                count = 0;                      // and again put count = 0;
            }
        }

        return Math.max(count, max);
    }

    //less optimum
    static int MaxOnes ( int [] arr){

        int count = 0;
        int j =0;
        int[] temp = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                count+=1;
            } else  {
                temp[j] =count;
                count = 0;
                j++;
            }
        }
        temp[j] =count;
     return    max(temp);
    }

    static int max(int[] temp){
      int  max = 0;
        for (int i = 0; i < temp.length ; i++) {
            if(max<temp[i]){
                max = temp[i];
            }
        }
        return max;
    }
}
