package LinearSearch;

public class EvenNoOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896,-2333};
        System.out.println(findNum(nums));

        System.out.println(CountNum(-2122));
    }

    static int findNum(int[] nums){
        int count =0;
        for (int num : nums) {
             if (even(num)){
                 count++;
             }
        }
        return count;
    }

     static boolean even (int num){
            int numOfDigits =  CountNum(num);

            if (numOfDigits%2==0){
                return true;
            }
            return false;
        }
    //count num of digits in a number

    static int CountNum(int num) {

        if (num<0){
            num = num * -1;
        }

        int count = 0;
        while (num>0){

            count++;
                    
            num = num/10;
        }
        return count;
    }


}
