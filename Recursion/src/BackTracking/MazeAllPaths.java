package BackTracking;

import java.util.Arrays;

public class MazeAllPaths {
    public static void main(String[] args) {

        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
//
//        Paths("",maze,0,0);

        int [][] path = new int[maze.length][maze[0].length];

        PathArray("",maze,0,0,path,1);


    }

    static void Paths(String p,boolean[][] maze, int row, int col){
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[row][col]){
            return;
        }

        // this is to restrict the already visited cells
        maze[row][col]=false;

        if(row < maze.length-1){
            Paths(p+"D",maze,row+1,col);
        }
        if(col < maze.length-1){
            Paths(p+"R",maze,row,col+1);
        }
        if(row > 0){
            Paths(p+"U",maze,row-1,col);
        }
        if(col > 0){
            Paths(p+"L",maze,row,col-1);
        }

        // this line is where the function call will be over
        // before the function gets removed, also remove the changes that were made by that function call
        maze[row][col]=true;

    }

    static void PathArray(String p,boolean[][] maze, int row, int col, int[][] path, int steps){
        if(row == maze.length-1 && col == maze[0].length-1){
            path[row][col]= steps;
            for (int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[row][col]){
            return;
        }
        // this is to restrict the already visited cells
        maze[row][col]=false;
        path[row][col]=steps;

        if(row < maze.length-1){
            PathArray(p+"D",maze,row+1,col, path, steps+1);
        }
        if(col < maze.length-1){
            PathArray(p+"R",maze,row,col+1, path, steps+1);
        }
        if(row > 0){
            PathArray(p+"U",maze,row-1,col, path, steps+1);
        }
        if(col > 0){
            PathArray(p+"L",maze,row,col-1, path, steps+1);
        }
        // this line is where the function call will be over
        // before the function gets removed, also remove the changes that were made by that function call
        maze[row][col]=true;
        path[row][col]=0;
    }
}
