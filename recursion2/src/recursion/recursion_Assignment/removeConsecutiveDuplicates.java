package recursion.recursion_Assignment;

public class removeConsecutiveDuplicates {
    public static void main(String[] args) {
        String str = "aabcca";
        System.out.println(removeConsecutive(str,""));
    }

    static String removeConsecutive (String s, String p){
        if(s.isEmpty()){
            return p;
        }


        if(s.length() >1 && s.charAt(0) == s.charAt(1)){
            return removeConsecutive(s.substring(1),p);
        }else return removeConsecutive(s.substring(1),p + s.substring(0,1));

    }
}
