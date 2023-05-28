package recursion.BasicsChap1;

public class sumOfDigits {
    public static void main(String[] args) {
        int num = 1344;
        System.out.println(digitSum(num));
    }

    static int digitSum(int num){
        if(num == 0){
            return num;
        }
        int rem = num % 10;
        return rem + digitSum(num/10);
    }
}
