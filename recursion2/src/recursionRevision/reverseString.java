package recursionRevision;

public class reverseString {
    public static void main(String[] args) {
        String str = "Harsh";
        System.out.println(reverse(str,""));

    }

    static String reverse(String s, String p){
        if(s.isEmpty()){
            return p;
        }

        p += s.substring(s.length()-1);

        return reverse(s.substring(0,s.length()-1),p);
    }


}
