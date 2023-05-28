package recursion.StriverSheetQuestions.Medium;

public class Atoi {
    public static void main(String[] args) {
        String s = "-2147483647";


        System.out.println(myAtoi(s));


    }

    static int myAtoi(String  s){
       // String str = s.replaceAll("[^0-9+-]", "");      // removes all the spaces
        if(s.length() == 0) return 0;
        String str = s.trim();      // removes leading spaces

        if(str.charAt(0) == '-'){
            int atoi = atoiHelper(str.substring(1), 0,0);
            return atoi;

        }else if (str.charAt(0) == '+'){
            return  atoiHelper(str.substring(1), 0, 1);
        }else return atoiHelper(str, 0, 1);
    }

    static int atoiHelper(String s, int ans,int sign){
        if( s.length() == 0 || !Character.isDigit(s.charAt(0))  ){
            if(sign == 1){
                return ans;
            }else return  0-ans;

        }

        int digit = s.charAt(0)-'0';

        if(Integer.MAX_VALUE/10 < ans || Integer.MAX_VALUE/10 == ans && Integer.MAX_VALUE %10 < digit) {
            if(sign == 1){
                return Integer.MAX_VALUE;
            }else return Integer.MIN_VALUE;
        }

        ans = ans*10 + digit;
        return atoiHelper(s.substring(1),ans,sign);
    }
}
