package Recursion2;

public class CountNumZeros {
    public static void main(String[] args) {
        int num = 302000004;
        int num2= 100000000;
        System.out.println(Count(num));

        System.out.println(getCount(num2));
    }

    static int count =0;        //
    static int Count(int n){
        if (n%10==n){
            return n;
        }

        int digit = n%10;

        if(digit==0){
            count++;
        }
        Count(n/10);

        return count;
    }


    //OR, by using helper function(putting counter in the  arguments )
    static int getCount (int n){
        return helper(n,0);
    }

    static  int helper(int n, int count){

        if(n==0){
            return count;
        }

        int digit = n%10;

        if(digit==0){
            return helper(n/10, count+1);
        }
        else
            return helper(n/10,count);

    }
}
