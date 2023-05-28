package Strings;

public class PrintLargestString {
    public static void main(String[] args) {

        String [] str = {"Mango","banana","Apple"};
        System.out.println(largestStringCaseSensitive(str));
        System.out.println(largestStringNotCaseSensitive(str));
    }
    static String largestStringCaseSensitive (String[] str){

        String largest = str[0];
        for (int i = 1; i < str.length; i++) {
            if(largest.compareTo(str[i]) < 0){
                largest=str[i];
            }
        }
        return largest;
    }

    static String largestStringNotCaseSensitive (String[] str){

        String largest = str[0];
        for (int i = 1; i < str.length; i++) {
            if(largest.compareToIgnoreCase(str[i]) < 0){
                largest=str[i];
            }
        }
        return largest;
    }
}
