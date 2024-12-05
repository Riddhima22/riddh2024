package Assignment2;
import java.util.Scanner;

public class PatternRhombus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++) {
                System.out.print("     ");}
            int k=i;
            for(int j=1;j<=i;j++){
                System.out.print(k+"    ");
                k++;}

            if(i>1){
                int m=2*(i-1);

                for(int j=1;j<i;j++){
                    System.out.print(m+"    ");
                    m--;}
            }
        System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int k=1;k<=n-i;k++){
                System.out.print("     ");
            }
            int k=i;
            for(int j=1;j<=i;j++){
                System.out.print(k+"    ");
                k++;
            }
            if(i>1){
                int m=2*(i-1);
                for(int j=1;j<=i-1;j++){
                    System.out.print(m+"    ");
                    m--;
                }
            }
            System.out.println();
        }
        sc.close();

    }
    
}
