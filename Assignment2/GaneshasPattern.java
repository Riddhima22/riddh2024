package Assignment2;
import java.util.Scanner;

public class GaneshasPattern {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
        for(int i=1;i<=(n/2)+1;i++){
            for(int j=1;j<=(n/2);j++){
                if(j==1||i==(n/2)+1){
                System.out.print("*");}
                else{
                    System.out.print(" ");
                }
            }
            
            for(int j=1;j<=(n/2)+1;j++){
                if(i==1||j==1){
                System.out.print("*");}
                else{
                    if(i!=(n/2)+1){
                    System.out.print(" ");}
                }
            }
            if(i!=(n/2)+1){
            System.out.println();}}
            
        for(int i=1;i<=(n/2)+1;i++){
             for(int j=1;j<=(n/2)+1&&i>1;j++){
                if(i==(n/2)+1||j==(n/2)+1){
                System.out.print("*");}
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=(n/2);j++){
                if(i==1||j==(n/2)){
                System.out.print("*");}
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

    

}
sc.close();
}
}
