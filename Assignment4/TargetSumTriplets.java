package Assignment4;
import java.util.*;

public class TargetSumTriplets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();}
        int target=sc.nextInt(); 

        Arrays.sort(arr);
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n-1;j++){
                for(int k=j;k<n-2;k++){
                    if(arr[i]+arr[j+1]+arr[k+2]==target){
                        System.out.println(arr[i]+", "+arr[j+1]+" and "+arr[k+2]);
                    }
                }
            }
        }

        sc.close();
    }
}