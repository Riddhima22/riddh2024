package Assignment4;
import java.util.*;

public class TargetSumPairs {
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
                if(arr[i]+arr[j+1]==target){
                    System.out.println(arr[i]+" and "+arr[j+1]);
                }
            }
        }
    sc.close();
}
}
