package BasicMaths;

public class Palindrome {
    public static void main(String[] args) {
        int num = 10;
        int temp = num;
        int palin = 0;

        while (num!=0){
            int digit = num%10;
            palin = palin*10+digit;
            num = num/10;
        }
        if(palin <0){
            System.out.println(false);
        }
        System.out.println(palin);
        if(temp == palin){
            System.out.println(true);
        }else {
            System.out.println(false);
        }


    }
}
