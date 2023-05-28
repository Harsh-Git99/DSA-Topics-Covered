package Strings;

public class shortestPath {
    public static void main(String[] args) {
        String str = "wneenesennn";

        String str1 = "SSSNEEEW";
        System.out.println(shortestPathDisplacement(str));

        System.out.println(shortestPathDistance(str1));


    }

    //Displacement
    static int shortestPathDisplacement (String str){

        int x=0,y=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='n'){
                y++;
            } else if (str.charAt(i)=='s') {
                y--;
            }
            else if(str.charAt(i)=='e'){
                x++;
            } else  {
                x--;
            }

        }
        return   (int)Math.sqrt((x*x) + (y*y));

    }

    static String shortestPathDistance (String str){

        int x=0,y=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='N'){
                y++;
            } else if (str.charAt(i)=='S') {
                y--;
            }
            else if(str.charAt(i)=='E'){
                x++;
            } else  {
                x--;
            }

        }

        String ans = "";
        while(x != 0 || y != 0){
            if(y>0){
                ans = ans + 'N';
                y--;
            }
            if(y<0){
                ans = ans + 'S';
                y++;
            }
            if(x>0){
                ans = ans + 'E';
                x--;
            }
            if(x<0){
                ans = ans + 'W';
                x++;
            }
        }
        return ans;
    }
}
