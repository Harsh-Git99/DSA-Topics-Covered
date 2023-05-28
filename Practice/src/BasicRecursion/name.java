package BasicRecursion;

public class name {
    public static void main(String[] args) {
        String str =  "harsh";
        System.out.println("The number of characters in the given name are = " + name(str));

    }

    static  int name(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count +=1;
        }
        return  count;
    }
}
