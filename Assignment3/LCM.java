package Assignment3;
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int num=0;
        if(n2>n1){
            num=n2;
        }
        else{
            num=n1;
        }
        while(num%n1!=0 || num%n2!=0){
            num++;
        }
         System.out.println(num);
        sc.close();
}
}