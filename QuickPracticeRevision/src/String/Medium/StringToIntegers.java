package String.Medium;

public class StringToIntegers {
    public static void main(String[] args) {
        String s = "-42";
        //String str = s.replaceAll("[ .]", "").trim();


        System.out.println(atoi(s));
    }

    static int atoi(String s) {
        s = s.trim();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch < 42 || ch > 57 || ch == 46 ) {        //for characters other than numbers
                return ans;
            }
//            if(ch == 43 || ch == 45){
//                continue;
//            }
            if(i < s.length()-1 && ch == '+' && s.charAt(i+1) == '-') {
                return ans;
            }
            if(i < s.length()-1 &&  ch == '-' && s.charAt(i+1) == '+') {
                return ans;
            }

            else if ( s.charAt(i) == '-') {
                for (int j = i+1; j < s.length(); j++) {
                    char ch2 = s.charAt(j);
                    if (ch2 < 42 || ch2 > 57) {        //for characters other than numbers
                        return 0;
                    }
                    if(ch2 == '+' || ch2 == '-') return 0;
                int ele = (char) ch2 - 48;
                    if(ans < -9999999){
                        return -2147483648;
                    }
                ans = ans * 10 - ele;
                i=j;
                }
            }else if ( s.charAt(i) == '+') {
                for (int j = i+1;    j < s.length(); j++) {
                    char ch2 = s.charAt(j);
                    if (ch2 < 42 || ch2 > 57) {        //for characters other than numbers
                        return 0;
                    }
                    if(ch2 == '+' || ch2 == '-') return 0;
                    int ele = (char) ch2 - 48;
                    if(ans > 9999999){
                        return 2147483647;
                    }
                    ans = ans * 10 + ele;
                    i=j;
                }
            } else {
                int ele = (char) ch - 48;
                if(ans > 9999999){
                    return 2147483647;
                }
                ans = ans * 10 + ele;
            }
        }
        return ans;
    }
}