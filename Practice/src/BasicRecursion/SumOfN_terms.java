package BasicRecursion;

public class SumOfN_terms {
    public static void main(String[] args) {
        int n =5;
        int sum = 0;
       // sumOfSeries(n,sum);
        System.out.println(Sum(n));
    }

    static void sumOfSeries(int num, int sum){
        if(num==0){
            System.out.println(sum);
            return;
        }
        sum = sum + (num*num*num);
        sumOfSeries(num-1,sum);
    }

    static int Sum (int n){
        //int sum = 0;
        if(n==0){
            return n ;
        }

        return n*n*n + Sum(n-1);
    }



    //without using recursion
    static int SumOfSeries(int n) {
        // code here
        if(n<=0){
            return n ;
        }
        if(n==1){
            return 1 ;
        }
        return (n*(n+1)/2)*(n*(n+1)/2) ;
    }
}
