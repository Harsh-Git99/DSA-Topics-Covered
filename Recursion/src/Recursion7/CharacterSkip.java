package Recursion7;

public class CharacterSkip {
    public static void main(String[] args) {
        String str = "bacapplecad";
        System.out.println( (skipString( str )));


       // skip2(str);


    }

//    static void skip(String original, String Processed){
//        if(original.isEmpty()){     //if Original string is empty, simply print Processed String
//            System.out.println(Processed);
//            return;
//        }
//
//        char ch = original.charAt(0);
//
//        if(ch == 'a'){
//            skip(original.substring(1),Processed);
//        }else {
//            skip(original.substring(1),Processed+ch);
//
//        }
//
//    }


//    static  String skip2(String original){
//        if(original.isEmpty()){     //if Original string is empty, return empty string
//            return "";      //empty string
//        }
//        char ch = original.charAt(0);
//        if(ch == 'a'){
//                 return skip2(original.substring(1));
//        }else {
//            return (  ch + skip2(original.substring(1)));
//        }
//    }

    static  String skipString(String original){
        if(original.isEmpty()){     //if Original string is empty, return empty string
            return "";      //empty string
        }
        if(original.startsWith("apple")){
            return skipString(original.substring(5));
        }else {
            return  original.charAt(0) + skipString(original.substring(1));
        }
    }
}
