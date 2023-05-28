package Recursion2;

public class ReduceToZero {
    public static void main(String[] args) {

        System.out.println(numberOfSteps(41));
    }


    static int numberOfSteps(int n){
        return helper(n,0);
    }

    static   int helper(int num, int count){
        if (num == 0){
            return count;
        }

        if (num %2 ==0){
            num = num/2;
            count+=1;
            return helper(num,count);
        }else
            num=num-1;
            count+=1;
            return helper(num,count);
    }
}
