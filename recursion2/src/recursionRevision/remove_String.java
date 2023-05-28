package recursionRevision;

public class remove_String {
    public static void main(String[] args) {

        String s = "mfsnappleappfnsj";
        System.out.println(remove2(s,""));
    }
    static String remove (String up, String p ){
        if(up.length() == 0){
            return p;
        }

        char ch = up.charAt(0);
        if(up.startsWith("apple")){
            return remove(up.substring(5),p);
        }else{
            return remove(up.substring(1),p+ch);
        }
    }

    static String remove2 (String up, String p ){
        if(up.length() == 0){
            return p;
        }

        char ch = up.charAt(0);
        if(up.startsWith("app") && !up.startsWith("apple") ){
            return remove2(up.substring(3),p);
        }else{
            return remove2(up.substring(1),p+ch);
        }
    }
}
