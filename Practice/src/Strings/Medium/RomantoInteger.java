package Strings.Medium;

public class RomantoInteger {
    public static void main(String[] args) {
        String s = "LVIII";

        System.out.println(romanToInt(s));
        System.out.println(romToInt(s));
    }

    //optimised
    static int romToInt(String s){
        int ans =0, Number =0, PrevNum = 0;

        for (int i = s.length()-1; i >=0 ; i--) {
            switch (s.charAt(i)){
                case 'M' : Number = 1000; break;
                case 'D' : Number = 500;break;
                case 'C' : Number = 100;break;
                case 'L' : Number = 50;break;
                case 'X' : Number = 10;break;
                case 'V' : Number = 5;break;
                case 'I' : Number = 1;break;
            }
            if(Number < PrevNum){
                ans -= Number;
            }else{
                ans += Number;
            }
            PrevNum = Number;
        }
        return ans;
    }

    //bruteForce
    static int romanToInt(String s) {
     int sum = 0;
     char[] chArr = s.toCharArray();
        for (int i = 0; i < chArr.length; i++) {

            if(chArr[i]  == 'I' ){
                if(i < chArr.length-1 && chArr[i+1]=='V'){
                    sum += 4;
                    i++;
                } else if (i < chArr.length-1 && chArr[i+1] == 'X') {
                    sum += 9;
                    i++;
                } else sum+=1;
            }
            else if(chArr[i] == 'V'){
                sum += 5;
            }
            else if(chArr[i]  == 'X' ){
                if(i < chArr.length-1 &&  chArr[i+1]=='L'){
                    sum += 40;
                    i++;
                } else if (i < chArr.length-1 &&  chArr[i+1] == 'C') {
                    sum += 90;
                    i++;
                } else sum+=10;
            }
            else if(chArr[i] == 'L'){
                sum += 50;
            }
            else if(chArr[i]  == 'C' ){
                if(i < chArr.length-1 &&  chArr[i+1]=='D'){
                    sum += 400;
                    i++;
                } else if (i < chArr.length-1 &&  chArr[i+1] == 'M') {
                    sum += 900;
                    i++;
                } else sum+=100;
            }
            else if(chArr[i] == 'D'){
                sum += 500;
            }
            else if(chArr[i] == 'M'){
                sum += 1000;
            }
        }
        return sum;
    }

}
