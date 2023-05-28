package Recursion7;

public class SkipApp {
    public static void main(String[] args) {
        System.out.println(skipAppNotApple("appappleappapppleappleapp"));
    }

    static String skipAppNotApple(String str) {

        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipAppNotApple(str.substring(3));
        }
        return str.charAt(0) + skipAppNotApple(str.substring(1));
    }
}
