package Assignment1;
import java.util.Scanner;

public class FibonacciPattern4{
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
		int sum =0;
        int f=0;
		int s=1;
        System.out.println(0);
		for(int i=1;i<n;i++){
			for(int j=1;j<=i+1;j++){
				f=s;
                s=sum;
                sum=f+s;
                System.out.print(sum +" ");}
			System.out.println();
		}
		sc.close();
	}
}