package String.Easy;

public class LargestOddNumberInString {
    public static void main(String[] args) {
        String s = "4206";
        System.out.println(largestOdd(s));
    }

    static String largestOdd(String s){
        StringBuilder sb = new StringBuilder();
        char[] str = s.toCharArray();
        for (int i = str.length-1; i >= 0 ; i--) {
            if(str[i]%2 != 0 ){
               return s.substring(0,i+1);
            }
        }
        return "NOTHING";
    }
}
