package BasicMaths;

public class Armstrong {
    public static void main(String[] args) {
        int num = 407;
       //System.out.println(Arm(num));

        System.out.println(  armstrongNumber(num));
    }

    static int power(int n){
        int power = 0;
        while (n!=0){
            power += 1;
            n=n/10;
        }
        return power;
    }
    static String Arm (int n){

        int number = n;
        int sum =0;
        int count = power(number);
        while (n!=0){
            int digit = n%10;
            sum += Math.pow(digit,count);
            n=n/10;
        }
        if(sum == number){
            return "yes";
        }else
            return "no";
    }

    static String armstrongNumber(int n){
        // code here
        int num = n;
        int number = n;
        int power = 0;
        while (n!=0){
            power += 1;
            n=n/10;
        }


        int sum =0;
        while (number!=0){
            int digit = number%10;
            sum += Math.pow(digit,power);
            number=number/10;
        }
        if(sum == num){
            return "Yes";
        }else
            return "No";
    }
}
