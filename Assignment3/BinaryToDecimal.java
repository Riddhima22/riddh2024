package Assignment3;
import java.util.Scanner;

public class BinaryToDecimal {
    //For binary number fedcba , Decimal number = f * 25 + e * 24 + d * 23 + …..+ a * 20.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=1;
        int dec=0;
        int num=1;
    
        while(n!=0){
            num=n%10;
            n/=10;
            
            dec+=num*count;
            
            count*=2;
            
        }
        System.out.println(dec);

                sc.close();
    
}
}
