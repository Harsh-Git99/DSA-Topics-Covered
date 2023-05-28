package Strings;

public class rotateString {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "cdeab";

        System.out.println(rotateString(str1,str2));


        // more optimised
        System.out.println(rotateString2(str1,str2));

    }

    static boolean rotateString(String s, String goal) {

        StringBuilder sb = new StringBuilder(s.length());
        char temp = '\u0000';
        for (int i = 0; i < s.length(); i++) {
            sb.setLength(0);
            temp = s.charAt(0);
            for (int j = 0; j < s.length(); j++) {

                //shift string elements to left
                if(j < s.length()-1){
                sb.append(s.charAt(j+1));
                }
            }
            sb.append(temp);
            s = String.valueOf(sb);
            if(s.equals(goal)){
                return true;
            }
        }
        return false;
    }


    static boolean rotateString2(String s, String goal) {
        StringBuilder str=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            if(str.toString().equals(goal)) return true;

            str.append(str.charAt(0));      // append the first element in the str at the end
            str.deleteCharAt(0);        // remove the 0th element of str
        }
        return str.toString().equals(goal);
    }
}
