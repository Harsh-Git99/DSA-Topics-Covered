package recursion.recursion_Assignment;

import java.util.ArrayList;

public class mazeWithObstacles {
    public static void main(String[] args) {

        boolean[][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };


       ObstaclePath(0,0,maze,"");

    }

    static void ObstaclePath(int r, int c, boolean[][] maze, String p){

        if(r==maze.length-1 && c == maze[0].length-1 ){
            System.out.println(p);
            return;
        }
        if(maze[r][c] == false){
            return;
        }

        if(r < maze.length-1){
            ObstaclePath(r+1,c,maze,p+"D");
        }
        if(r < maze.length-1 &&  c < maze[0].length-1){
            ObstaclePath(r+1,c+1,maze,p + "C");
        }
        if( c < maze[0].length-1){
            ObstaclePath(r,c+1,maze,p+"R");
        }

    }
}
