package Lecture12;
import java.util.Scanner;
import java.util.Arrays;

public class twoDarray {
    public static void main(String[] args) {
        
    Scanner read= new Scanner(System.in);
		int n= read.nextInt();
        int m=read.nextInt();

		int[][] arr= new int[n][m];
	    
		for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
		    arr[i][j]=read.nextInt();
            }
    
}

int sum=0;
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){ //sum of all elements in 2d array
    sum+=arr[i][j];
    }
}
    System.out.println(sum);

    //for (int i = 0; i <n; i++) {//sorting by  rows
      //  Arrays.sort(arr[i]);
    //}   
      
       // Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0])); //sorting by  columns

       /*  int[][] num= new int[m][n]; 
        for(int i=0;i<n;i++){      //transpose of an array
            for(int j=0;j<m;j++){
		    num[j][i]=arr[i][j];
            }}

            for(int i=0;i<n;i++){      //transpose of an array by sir method
                for(int j=i;j<m;j++){
                    int temp=arr[j][i];
                    arr[j][i]=arr[i][j];
                    arr[i][j]=temp;
                }*/

       
    

//flattening of an array(2d to 1d)
int[] arr1=new int[n*m];
int k=0;
for (int i = 0; i <n; i++) {
    for(int j=0;j<m;j++){
        arr1[k]=arr[i][j];
        k++;
    }}
    //(1d to 2d )
int f=0;
    for (int i = 0; i <n; i++) {
        for(int j=0;j<m;j++){
            arr[i][j]=arr1[f];
            f++;
        }}




for (int i = 0; i <n; i++) {
    for(int j=0;j<m;j++){
    System.out.print(arr[i][j] + " ");}
    System.out.println();
}

for(int i=0;i<arr1.length;i++){
    System.out.print(arr1[i]+" ");
}

/*for (int i = 0; i <m; i++) {
    for(int j=0;j<n;j++){
    System.out.print(num[i][j] + " ");}
    System.out.println();
}*/





read.close();
}
}

