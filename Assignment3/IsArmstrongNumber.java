package Assignment3;
import java.util.Scanner;
public class IsArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=n;
        int p=n;
        int num=0;
        int len=0;
        while(n!=0){
            num=n%10;
            n/=10;
            len++;
        }
        
        
        int temp=0;
        
        while(m!=0){
            int num1=1;
            num=m%10;
            m/=10;
            for(int i=1;i<=len;i++){

            num1*=num;}
            temp+=num1;
            
        }
        if(temp==p){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        sc.close();
    
}
}