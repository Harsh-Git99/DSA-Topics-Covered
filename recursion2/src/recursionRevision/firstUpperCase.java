package recursionRevision;

public class firstUpperCase {
    public static void main(String[] args) {
        String str = "geeksforgeeKs";
        System.out.println(firstUpperCase(str));
    }

    static char firstUpperCase(String str){
         char ch =  str.charAt(0);
        if(ch+0 >=65 && ch+0<=90 ){
            return ch;
        }

        return firstUpperCase(str.substring(1));

    }


}
