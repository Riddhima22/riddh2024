package Lecture18;

public class Backtracking {
    
    static int[][] ans= new int[100][100];
    static void display(int x,int y){
        for(int i=0;i<=x;i++){
            for(int j=0;j<=y;j++)
                System.out.println(ans[i][j]+" ");
            System.out.println();;
            
        }
    }
    static boolean findcheese(int[][] maze,int i,int j,int x,int y){
        if(i==x &&j==y){
            ans[i][j]=1;
            return true;

        }
        ans[i][j]=1;
        if(i==x && maze[i][j]==0 && j<=y){
            if(findcheese(maze, i+1, j, x, y))
                return true;
            if(findcheese(maze, i, j+1, x, y))
                return true;
            if(findcheese(maze, i, j-1, x, y))
                return true;
        }
    ans[i][j]=0;
    return false;
    }

    public static void main(String[] args) {
        int[][] maze= {
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,1,0,0,0},
            {0,0,0,0,0}
                };   
        int x=3; int y=4;  
        int i=0; int j=0;
        findcheese(maze, i, j, x, y);
        display(x, y);
            
            
            }
    }

