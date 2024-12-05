package Assignment4;
import java.util.*;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        int arr1[]= new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();}
        
        int k=0;
        int e=0;
        int[] ind=new int[n];
        for(int i=0;i<n;i++){
            for(int j=i;j<n-1;j++){
                if(arr1[i]==arr1[j+1]){
                    
                   
                       
                            ind[k]=j+1;
                               k++;
                        // break;
                    }
                }
            }
        

        for(int i=0;i<ind.length;i++){
            System.out.print(ind[i]+" ");}

            /*int[] arr=new int[n];
        for(int i=0;i<ind.length;i++){
            if(ind[i]!=0 && ind[i]!=i){
                arr[e]=arr1[i];
                e++;*/
            
        
    int m=0;
        int d=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(ind[m]==i){
                    if(k!=1){
                        m++;}
            }
                else {
                    arr[d]=arr1[i];
                    d++;
                    //break;
                    }
            break;        
               
            }

        }    
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");}
    sc.close();

}
}
