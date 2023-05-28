package Strings;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            //System.out.println(ch);
            series = series+ch;
            // it is creating new object everytime as the Strings are immutable
            // copying the old one and appending the new changes to it
            //this gives us a complexity of O(N^2) which is very bad
            //to overCome this problem we use ***StringBuilder*** which is separate class

        }
        System.out.println(series);

    }
}
