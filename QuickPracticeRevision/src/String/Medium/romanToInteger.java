package String.Medium;

public class romanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(rom(s));

    }


    static int rom (String s){
        int sum = 0, number  = 0 , prevNum=0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case 'M' : number = 1000; break;
                case 'D' : number = 500; break;
                case 'C' : number = 100; break;
                case 'L' : number = 50; break;
                case 'X' : number = 10; break;
                case 'V' : number = 5; break;
                case 'I' : number = 1; break;
            }
            if(number < prevNum){
                sum -= number;
            }else {
                sum+=number;
            }prevNum = number;
        }
        return sum;
    }


    static int roman (String s){
        char[] str = s.toCharArray();
        int sum = 0;

        for (int i = str.length-1; i >=0 ; i--) {
            if(str[i] == 'I'){
                sum = sum+1;
            } else if (str[i] == 'V' ) {
                if(i > 0 && str[i-1] == 'I'){
                    sum = sum + 4;
                    i--;
                }else sum = sum + 5;
            }else if (str[i] == 'X' ) {
                if(i > 0 && str[i-1] == 'I'){
                    sum = sum + 9;
                    i--;
                }else sum = sum + 10;
            }else if (str[i] == 'L' ) {
                if(i > 0 && str[i-1] == 'X'){
                    sum = sum + 40;
                    i--;
                }else sum = sum + 50;
            }else if (str[i] == 'C' ) {
                if(i > 0 && str[i-1] == 'X'){
                    sum = sum + 90;
                    i--;
                }else sum = sum + 100;
            }else if (str[i] == 'D' ) {
                if(i > 0 && str[i-1] == 'C'){
                    sum = sum + 400;
                    i--;
                }else sum = sum + 500;
            }else if (str[i] == 'M' ) {
                if(i > 0 && str[i-1] == 'C'){
                    sum = sum + 900;
                    i--;
                }else sum = sum + 1000;
            }
        }
        return sum;
    }
}
