package Lecture12;

public class prac {
   /*  public static void main(String[] args) {
        public boolean checkvalid(char[][] arr,int i,int j) {
            //Row & Col
            for(int y=0;y<9;y++){
                if(y!=i&&y!=j){
                if(arr[y][j]==arr[i][j]||arr[i][j]==arr[i][y]){
                    return false;
                }
                }
            }
            //sub block
            int n=arr.length;
            int root=(int)Math.sqrt(n);
            int ri=(i/root)*root;
            int rj=(j/root)*root;
            for(int x=ri;x<ri+root;x++){
                for(int y=rj;y<rj+root;y++){
                    if(x!=i&&y!=j){
                        if(arr[x][y]==arr[i][j]){
                            return false;
                        }
                    }
                }
                return true;
            }
    
            
        }
    public boolean isValidSudoku(char[][] arr) {
         for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    if(checkvalid(arr[i][j])
                        return false;
                }
            }
    
    }
    }
    

*/
public static void main(String[] args) {
    int matrix[]= {(1,2,3),(4,5,6),(7,8,9)};
    int n=matrix.length;
    int m=matrix[0].length;
    int[] arr=new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
        arr[i][j]=matrix[n-1][j];
        }
        n--;
}
}


}

