package Assignment2;
import java.util.Scanner;

public class PatternInvertedHourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
        for(int i=1;i<=n+1;i++){
            for(int j=n;j>=n-i+1&&j>0;j--){
                System.out.print(j+" ");
            }
            for(int k=1;k<=2*(n-i+1)-1;k++){
                System.out.print("  ");
            }
            for(int m=n-i+1;m<=n;m++){
                System.out.print(m+" ");
            }
            System.out.println();
        }  
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(j+" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("  ");
            }
            
            for(int m=i;m<=n;m++){
                System.out.print(m+" ");
                }
            
            System.out.println();
        } 
        sc.close();
    }
    
}
