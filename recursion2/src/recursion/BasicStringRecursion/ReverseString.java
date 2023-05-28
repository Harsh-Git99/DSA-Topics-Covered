package recursion.BasicStringRecursion;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','a','n','n','a','h'};
        reverse(s,0);
    }

    static void reverse (char[] s, int i){
        if(i == s.length){
         return;
        }

        reverse(s, i+1);
        System.out.print(s[i] +" ");
    }
}
