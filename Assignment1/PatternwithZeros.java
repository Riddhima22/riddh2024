package Assignment1;
import java.util.Scanner;

public class PatternwithZeros {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
		for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || i==j){
                    System.out.print(i+"    ");}
                if(j>1 && j<i){
					System.out.print(0+"    ");}
                /*if(i>1 && i==j){
					System.out.print(i);}
				*/
            }

        System.out.println();}
        sc.close();
		}
    
}

