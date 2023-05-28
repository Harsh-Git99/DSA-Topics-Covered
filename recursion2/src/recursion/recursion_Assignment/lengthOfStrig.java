package recursion.recursion_Assignment;

public class lengthOfStrig {
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(length(str));

    }

    static int length(String s){
        if(s.isEmpty()){if(s.isEmpty()){
            return 0;
        }

            int count;
            count = 1 + length(s.substring(1));
            return count;

        }

        int count = 0;
        count = count+1;
        count = count + length(s.substring(1));
        return count;
    }
}
