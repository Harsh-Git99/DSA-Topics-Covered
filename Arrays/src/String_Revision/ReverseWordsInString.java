package String_Revision;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";

        System.out.println(reverse(s));
    }

    static String reverse (String s){
        String[] a = s.trim().split("\\.");
        StringBuilder sb = new StringBuilder();

        for (int i = a.length-1; i >0 ; i--) {
            if(a[i] != ""){
                sb.append(a[i] + " ");
            }
        }
        sb.append(a[0]);
        return sb.toString();
    }

//    String[] a = s.trim().split("\\s+");
//    StringBuilder sb = new StringBuilder();
//
//        for (int i = a.length-1; i >=0 ; i--) {
//        if(a[i]!=""){
//            sb.append(a[i]).append(" ");
//
//        }
//    }
//    String res = sb.toString();
//        return res.substring(0,res.length()-1);
}
