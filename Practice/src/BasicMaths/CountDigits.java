package BasicMaths;

public class CountDigits {
    public static void main(String[] args) {
        int N = 22074;
        int num = N;
        int count = 0;


        while (num!=0){
            int digit= num %10;

            if(digit > 0 && N%digit==0){
                count+=1;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}