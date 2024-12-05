package Assignment2;
import java.util.Scanner;

public class HollowDiamondPattern6 {
    public static void main (String args[]) {
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int n = (N/2)+1;
    for(int j=1;j<=2*n-1;j++){
        System.out.print("*    ");}
    System.out.println();


    for(int i=1;i<=n-1;i++){ 
        for(int j=n-i+1;j>1;j--){
            System.out.print("*    ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("     ");
        }  
        for(int k=2;k<=i;k++){
            System.out.print("     ");
        }
      for(int j=n-i+1;j>1;j--){
        System.out.print("*    ");

      }
      System.out.println();}
    for(int i=1;i<=n-2;i++){
        for(int j=1;j<=i+1;j++){
        System.out.print("*    ");
        }
        for(int k=n-2-i+1;k>=1;k--){
            System.out.print("     ");
        }
        for(int k=n-3-i+1;k>=1;k--){
            System.out.print("     ");
        }
        for(int j=1;j<=i+1;j++){
            System.out.print("*    ");
            }
        

    
    System.out.println();}

    for(int j=1;j<=2*n-1;j++){
        System.out.print("*    ");}
    
        sc.close();
          
    }
    
    
}

