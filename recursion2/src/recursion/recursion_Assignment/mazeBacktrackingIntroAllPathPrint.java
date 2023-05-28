package recursion.recursion_Assignment;

import java.util.Arrays;

public class mazeBacktrackingIntroAllPathPrint {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        int[][] path = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };

        allPathPrint(0,0,maze,"", 1,path);
    }

    static void allPathPrint(int r, int c, boolean[][] maze,String p, int step, int[][]path ){
        if (r == maze.length-1 && c == maze[0].length-1){
            path[r][c] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]){
            return;
        }


        maze[r][c] = false;
        path[r][c] = step;
        if(r < maze.length-1){
            allPathPrint(r+1,0,maze,p+ "D",step+1,path);
        }
        if(r > 0){
            allPathPrint(r-1,0,maze,p+"U",step+1,path);
        }
        if(c < maze[0].length-1){
            allPathPrint(r,c+1,maze,p+"R",step+1,path);
        }
        if(c > 0){
            allPathPrint(r,c-1,maze,p+"L",step+1,path);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
