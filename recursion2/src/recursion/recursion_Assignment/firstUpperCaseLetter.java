package recursion.recursion_Assignment;

public class firstUpperCaseLetter {
    public static void main(String[] args) {
        String str = "GeeKs";
       // System.out.println(getUpper(str));
        //System.out.println(getUpperCase(str));

        char[] ans = new char[str.length()];
        System.out.println(getAllUpper(str,0,ans));

    }

    //using recursion

    static char getUpper(String str){
        if(str.length() == 0){
            return 0;
        }
        char ch = str.charAt(0);
        if(ch < 91 ){
            return ch;
        }else return getUpper(str.substring(1));

    }

    static  char[] getAllUpper(String str, int i, char[] ans){

        if(str.length() == 0){
            return ans;
        }

        char ch = str.charAt(0);
        if(ch < 91){
           ans[i] = ch;
            getAllUpper(str.substring(1),i+1, ans);
           return ans;
        }
        return getAllUpper(str.substring(1),i,ans);
    }



    static char getUpperCase(String str){
        str = str.replaceAll("[^A-Z]","");
        char ch = '\u0000';
        ch = str.charAt(0);
        return ch;
    }
}
