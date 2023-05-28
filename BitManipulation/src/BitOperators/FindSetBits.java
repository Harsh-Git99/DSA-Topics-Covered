package BitOperators;

public class FindSetBits {
    public static void main(String[] args) {
        int n = 15;
        System.out.println("The number n is represented in binary like this :-"+Integer.toBinaryString(n));
        int count = 0;
        while (n>0){
            int last = n&1;
            if (last==1){
                count++;
            }
            n= n>>1;
        }
        System.out.println("Number of set bits in the given number is "+count);


    }
}
