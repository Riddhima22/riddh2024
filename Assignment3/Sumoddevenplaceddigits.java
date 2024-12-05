package Assignment3;
import java.util.Scanner;

public class Sumoddevenplaceddigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd =0;
        int even =0;
        int count=1;
        int num=1;
        while(num!=0){

            num=n%10;
            n/=10;
            if(count%2==0){
                even+=num;
                count++;
            }
            else{
                odd+=num;
                count++;
            }
        }
        System.out.println(odd);
        System.out.println(even);
        sc.close();
    
}
}
