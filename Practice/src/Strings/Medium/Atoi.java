package Strings.Medium;

public class Atoi {
    public static void main(String[] args) {
        String s = "- jskdf";

        System.out.println(myAtoi(s));
    }

    static int myAtoi(String s) {

        String str = s.replaceAll("[^0-9+-]", "");
        int sum = 0;
        //System.out.println(str);
        char ch = str.charAt(0);
        if (ch == '-') {
            for (int i = 1; i < str.length(); i++) {
                char c = str.charAt(i);
                sum = sum*10 - (c-48);
            }
        } else if (ch == '+') {
            for (int i = 1; i < str.length(); i++) {
                char c = str.charAt(i);
                sum = sum*10 + (c-48);
            }
        }else{
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                sum = sum*10 + (c-48);
            }
        }

        return sum;
    }
}
