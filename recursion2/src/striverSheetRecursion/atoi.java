package striverSheetRecursion;

public class atoi {
    public static void main(String[] args) {
        String s = "5387";

        System.out.println(atoi(s));

        //System.out.println((s.charAt(0)-0));
    }

   static int atoi(String str) {
        // Your code here

       boolean b = helper(str);
       if(!b){
           return -1;
       }else{
           return ans;
       }

    }
    static int ans =0;
    static boolean helper(String s){
        if(s.isEmpty()){
            return true;
        }
        int i = 0;
        if((s.charAt(i)-0) < 48 && (s.charAt(i)-0) > 57  ){
            return false;
        }
        ans = ans * 10 + s.charAt(i) - 48;
        return helper(s.substring(1));
    }
}
