package BinarySearch.medium;

public class FindNthRootOfM {
    public static void main(String[] args) {

        int num = 15;
        int n = 2;
        System.out.println(  NthRoot(1,4));
    }


    static int NthRoot(int num,int n){

        int low = 1;
        if(num > 1000){
            int high = num/2;
        }
        int high = num;

        while(low <= high){
            int mid = (high+low)/2;
            long mul = 1;
            for (int i = 0; i < n; i++) {
                mul = mul*mid;
            }
            if(mul == num){
                return mid;
            } else if (mul < num) {
                low = mid +1;
            }else
                high = mid -1;
        }
        return -1;
    }
}
