package Assignment1;
import java.util.Scanner;

public class PatternMountain {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i && j<=n-1;j++){
				System.out.print(j+"    ");}
            for(int k=1;k<=2*(n-i)-1;k++){
                System.out.print("     ");}
            for(int m=i;m>=1;m--){
                System.out.print(m+"    ");}

        System.out.println();}
        sc.close();
	}
    
}
