package BitOperators;

public class MagicNum {
    public static void main(String[] args) {
        int n =6;

        int ans =0;
        int base =5;
        while (n >0){
            int last= n&1;// gives the last number of the binary
            n= n>>1;          // shifts to right
            ans = ans + last * base;
            base =  base *5;
        }
        System.out.println(ans);
    }
}
