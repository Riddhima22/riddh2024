package Assignment3;
import java.util.Scanner;

public class ShoppingGame {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int T=  sc.nextInt();
    for(int i=1;i<=T;i++){
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    if(n1>n2){
        System.out.println("Aayush");
    }
    else{
        System.out.println("Harshit");
    }
}

    sc.close();
    
}
}
