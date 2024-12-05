package Assignment4;
import java.util.*;

public class Squaresofsortedarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        int arr1[]= new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();}
        
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=arr1[i]*arr1[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");}
            sc.close();
}
}
