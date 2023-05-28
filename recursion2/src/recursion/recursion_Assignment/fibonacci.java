package recursion.recursion_Assignment;

public class fibonacci {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(findFibo(n));

    }

    static  int findFibo(int n){
        if(n == 1 || n == 0 ){
            return n;
        }


        int sum =  findFibo(n-1)+findFibo(n-2);
        return sum;
    }
}
