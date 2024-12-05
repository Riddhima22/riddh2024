package Assignment2;
import java.util.Scanner;

public class PatternDoubleSidedArrow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                for(int i=1;i<=n/2;i++){
                    for(int j=2*(i-1);j<n-1;j++){
                        System.out.print("  ");}
                    for(int k=i;k>=1;k--){
                        System.out.print(k+" ");
                    }    
                    for(int j=2;j<=i;j++){
                        System.out.print("  ");
                    }
                    for(int j=3;j<=i;j++){
                        System.out.print("  ");
                    }
                    if(i>1){
                    for(int k=1;k<=i;k++){
                        System.out.print(k+" ");
                    }}
                    System.out.println();
                }
                for(int i=1;i<=(n/2)+1;i++){
                    for(int j=0;j<2*(i-1);j++){
                        System.out.print("  ");
                    }
                    for(int k=(n/2)-i+2;k>=1;k--){
                        System.out.print(k+" ");
                    }
                    for(int j=i;j<=n/2;j++){
                        System.out.print("  ");
                    }
                    for(int j=i;j<=(n/2)-1;j++){
                        System.out.print("  ");
                    }
                    if(i<=n/2){
                    for(int k=1;k<=(n/2)-i+2;k++){
                        System.out.print(k+" ");
                    }}
                    System.out.println();
                } 
                sc.close();
    
}
}
