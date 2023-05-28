package BitOperators;

public class CalculateA_Power_B {
    public static void main(String[] args) {
        int base =2;
        int Power = 4;
        int ans=1;

        while (Power>0){
            int last = Power&1;
            if(last==1){
                ans = ans * base;

            }
             base = base *base;
            Power = Power>>1;
        }
        System.out.println(ans);
    }
}
