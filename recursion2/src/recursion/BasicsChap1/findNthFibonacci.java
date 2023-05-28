package recursion.BasicsChap1;

public class findNthFibonacci {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(finonacci(n));

    }
    static  int finonacci (int n){
        //base condition
        if(n<2 ){
            return n;
        }
      int fibo =   finonacci(n-1) + finonacci(n-2);
        return fibo;
    }
}
