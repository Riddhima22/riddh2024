package Assignment2;
import java.util.Scanner;

public class PatternHourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
        
         for(int i=1;i<=n;i++){
            for(int k=1;k<=i-1;k++){
                System.out.print("  ");
            }
            for(int j=n-i+1;j>=0;j--){
                System.out.print(j+" ");
            }
            for(int m=1;m<=n-i+1;m++){
                System.out.print(m+" ");
            }
            
            System.out.println();

    }
    for(int i=0;i<=n;i++){
        for(int k=1;k<=n-i;k++){
            System.out.print("  ");
        }
        for(int j=i;j>=0;j--){
            System.out.print(j+" ");
        }
        for(int m=1;m<=i;m++){
            System.out.print(m+" ");
        }
        System.out.println();
    
}
sc.close();
}
}
