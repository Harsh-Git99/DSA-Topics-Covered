package recursion.BasicStringRecursion;

public class removeCharacterFromStr {
    public static void main(String[] args) {
        String str = "baccad";

        System.out.println(removeInBody(str));
        //System.out.println(remove(str,"",0));

    }

    //approach 1 : Pass the answer String in the argument.
    static String remove (String str , String ans, int i){
    if(i == str.length()){
        return ans;
    }
    if( str.charAt(i) != 'a'){
        ans = ans + str.charAt(i);
       return remove(str,ans,i+1);
    }
      return   remove(str,ans,i+1);
    }




    //approach 2 : create the answer variable in function body
    static String removeInBody(String str){
        if(str.length() ==0){
            return "";
        }
        String ans = "";
        int i=0;
        if(str.charAt(i) != 'a'){
            ans = ans + str.charAt(i);
        }
        String answer  = ans + removeInBody(str.substring(i+1,str.length()));
        return answer;
    }

}
