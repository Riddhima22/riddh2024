package Assignment2;
import java.util.Scanner;

public class MirrorStarPattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=(n/2)+1;i++){
            for(int k=1;k<=(n/2)+1-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int m=1;m<=i-1;m++){
                System.out.print("* ");
            }
            
        System.out.println();}
        for(int i=1;i<=n/2;i++){
            for(int k=1;k<=i;k++){
                System.out.print("  ");
            }
            for(int j=n/2;j>=i;j--){
                System.out.print("* ");
            }
            for(int m=n/2;m>i;m--){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
