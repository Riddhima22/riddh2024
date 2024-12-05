package Assignment3;
import java.util.Scanner;

public class ChewbaccaandNumber {
    public static void main(String[] args){
        
    
Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long min=n;
        long num1=1;
        long num2=1;
        int count=1;
        while(n!=0){
            num1=n%10;
            num2=9-num1;
            
            if(num2<num1&&n!=9){
                min-=(num1*count);
                min+=(num2*count);
            }
            n/=10;
            count*=10;}


            System.out.println(min);
            sc.close();
        }
    }
    
        