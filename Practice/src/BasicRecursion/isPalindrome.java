package BasicRecursion;

public class isPalindrome {
    public static void main(String[] args) {
        String st = "A man, a plan, a canal: Panama";


        System.out.println(  isPalin("race a car"));



    }

    static boolean isPalin(String st){
        String str = st.toLowerCase();
        String plainStr =   str.replaceAll("[^a-z0-9]","");
        //char ch = st.charAt(0);
       int  start = 0;
       int end = plainStr.length()-1;

        while(start<end){
            if(plainStr.charAt(start)==plainStr.charAt(end)){
                start++;
                end--;
            }else
                return false;
        }
        return true;
    }
}
