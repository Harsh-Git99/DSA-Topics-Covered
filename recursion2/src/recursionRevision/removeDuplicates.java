package recursionRevision;

public class removeDuplicates {
    public static void main(String[] args) {
        String s = "aaabbbc";

        System.out.println(remove(s,""));

    }

    static String remove(String up, String p){
        if(up.length() == 1){
            p = p+ up.charAt(0) ;
            return p;
        }

        char ch = up.charAt(0);

        if(up.charAt(1) == ch){
            return remove(up.substring(1),p);
        }else return remove(up.substring(1),p+ch);


    }
}
