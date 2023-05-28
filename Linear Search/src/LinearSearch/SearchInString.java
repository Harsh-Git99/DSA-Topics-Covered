package LinearSearch;

public class SearchInString {
    public static void main(String[] args) {

        String name = "Kunal";
        char target = 'p';
        System.out.println(search(name,  target));
    }

        static boolean search(String str, char tar){

            for (int i = 0; i < str.length(); i++) {        // in string, we call length() method/function and in Int we use the  .length variable

                int element = str.charAt(i);        // to access character at any index of String, we us .charAt() method
                if (tar == element){
                    return  true;
                }

            }

            return false;

        }
}

