package Assignment3;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int num=0;
        if(n2<n1){
            num=n2;
        }
        else{
            num=n1;
        }
        while(n1%num!=0 || n2%num!=0){
            num--;
        sc.close();
}
System.out.println(num);
}
}
