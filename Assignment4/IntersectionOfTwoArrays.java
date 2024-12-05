package Assignment4;
import java.util.Scanner;
import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr1[]= new long[n];
        long arr2[]= new long[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextLong();
        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextLong();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);



        long arr[]=new long[n];
        int k=0;
        for(int i=0;i<n;i++){
           
                if(arr1[i]==arr2[i]){
                    arr[k]=arr1[i];
                    k++;
        
            }
    }
    long[] temp= new long[k];
    for(int i=0;i<k;i++){
        temp[i]=arr[i];
    }
    
    Arrays.sort(temp);
    System.out.print("[");
    for(int i=0;i<k;i++){
        
        if(i!=k-1){

         System.out.print(temp[i]+", ");}
        else{
            System.out.print(temp[i]);

        }

}
    System.out.print("]");



    sc.close();
}
}
