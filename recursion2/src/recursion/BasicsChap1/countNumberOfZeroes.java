package recursion.BasicsChap1;

public class countNumberOfZeroes {
    public static void main(String[] args) {
        int num = 30204;
        //System.out.println(countZeroes(num));
//        countZeroesRecusivelly(num);
//        System.out.println(count);

//        countZeroesRecusivelly(num);
//        System.out.println(count);


        System.out.println(count(num));

    }

    //recursive Approach 1
    // special pattern->How to pass a value to above calls
    static int count (int n){
        return helper2(n , 0);
    }
    static int helper2(int num, int count){
        if(num == 0){
            return count;
        }
        int rem = num%10;
        if(rem == 0) count++;
       return helper2(num/10,count);

    }


    //recursive Approach 2
    static int count = 0;
    static void countZeroesRecusivelly(int n){

        int digits = (int) Math.log10(n);
        helper(n,digits);

    }

    static int helper(int n , int digits){
        if(n == 0 && digits < 1){
            return count;
        }
        int rem = n%10;
        if(rem == 0) count++;
       return helper(n/10 , digits=digits-1) ;
    }


    //iterative approach
    static int countZeroes(int n){
        int count = 0;

        while(n != 0){
            int rem = n%10;
            if(rem == 0) count++;
            n = n/10;
        }
        return count;
    }
}
