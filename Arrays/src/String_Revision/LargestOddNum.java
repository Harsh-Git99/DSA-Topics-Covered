package String_Revision;

public class LargestOddNum {
    public static void main(String[] args) {
        String s  = "35427";
        System.out.println(largestOdd(s));
    }

    static  String largestOdd (String s){

        for (int i = s.length()-1; i >= 0 ; i--) {
            if(s.charAt(i) % 2 !=0){
                return s.substring(0,i +1);
            }
        }
        return "";
    }
}
