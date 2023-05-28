package Strings;

public class StBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 25; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
        //this is not creating new objects but making changes in the same object only
        // hence it is mutable
    }
}
