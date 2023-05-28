package Strings;

public class palindrome {
    public static void main(String[] args) {

        String str = "racecar";
        System.out.println( isPalin(str));
    }

    static boolean isPalin(String str){

        int i =0;
        int j = str.length()/2;

        while (i<=j){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
            j--;
            i++;
        }
        return true;
    }
}
