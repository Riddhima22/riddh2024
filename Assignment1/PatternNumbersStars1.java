package Assignment1;
import java.util.Scanner;

public class PatternNumbersStars1 {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
		for(int i = n ; i >= 1 ;i--){
            for(int j = 1 ;j<=i;j++){
				System.out.print(j+" " );}
				if(i < n){
					for(int k = 1 ; k <= n -i ;k++){
						System.out.print("* " );}
				}
				if(i < n-1){
					for(int m = 1 ;m<=n-i-1 ;m++){
						System.out.print("* ");}
				}
				System.out.println();
		}
		sc.close();
	}
    
}
