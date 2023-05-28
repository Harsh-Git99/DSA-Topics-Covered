package Arrays.extra;

import java.util.Scanner;

public class rollerCoaster {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter chefs height");
        int chefSon = scn.nextInt();
        System.out.println("Enter min height");
        int minHeight  = scn.nextInt();
        boolean ans = optimumHeight(chefSon,minHeight);
        if(ans == true) {
            System.out.println("YES");

        }else System.out.println("NO");


    }

    static boolean optimumHeight(int ch , int h){

        if(ch <= h)return false;

        return true;
    }
}
