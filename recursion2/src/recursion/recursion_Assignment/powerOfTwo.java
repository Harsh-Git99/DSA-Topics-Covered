package recursion.recursion_Assignment;

public class powerOfTwo {
    public static void main(String[] args) {
        int n = 1073741825;
        //System.out.println(  isPower(n));

        System.out.println(isPowerOfTwo(n,1));
    }



    static boolean isPowerOfTwo(int n, int product) {
        if(product > n || product > 536870912){
            return false;
        }
        product = product *2;
        if(product == n){
            return true;
        }else return isPowerOfTwo(n,product);

    }
    static boolean isPower(int n){

        if(n == 1){
            return true;
        }
        int p = 1;
        while(p != n){
             p = p *2;
             if(p == n){
                 return true;
             }else if(p>n){
                 return false;
            }
        }
        return false;
    }
}
