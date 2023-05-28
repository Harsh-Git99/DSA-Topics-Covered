package recursionRevision;

public class remove_character {
    public static void main(String[] args) {
        String str = "appleccad";
        System.out.println(remove(str,""));
    }

    //ans in the argument
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

    static String remove (String up){
        if(up.length() == 0){
            String p = "";
            //p+= up.charAt(0);
            return p;
        }
        char ch = up.charAt(0);
        String p = "";
        if(ch != 'a'){
            return p = ch + remove(up.substring(1));
        }else {
            return  p = remove(up.substring(1));
        }

    }
}
