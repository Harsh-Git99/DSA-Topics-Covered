package recursion.BasicStringRecursion;

public class SkipString {
    public static void main(String[] args) {
        String str = "bcappapplefg";
        //System.out.println(skipApple(str));
        System.out.println(skipApp(str));
    }

    static String skipApple(String str){
        if(str.isEmpty()) {
            return "";
        }


        String ans = "";
        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        }else {
               ans = str.charAt(0) +  skipApple(str.substring(1));
        }
        return ans;
    }

    static String skipApp(String str){
        if(str.isEmpty())return "";

        String ans = "";
        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipApp(str.substring(3));
        }else {
            ans = str.charAt(0) +  skipApp(str.substring(1));
        }
        return ans;
    }
}
