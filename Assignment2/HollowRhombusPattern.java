package Assignment2;
import java.util.Scanner;

public class HollowRhombusPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int k=n-1;k>=i;k--){
                    System.out.print(" ");
                }
                for(int j=1;j<=n;j++){
                    if(i==1||i==n||j==1||j==n){
                    System.out.print("*");}
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            sc.close();
    
}
}
