package Assignment4;
import java.util.*;



public class SumofTwoArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        int arr1[]= new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();}
        int m = sc.nextInt();
        int arr2[]= new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();}
        int[] arr= new int[n+m];    
        int sum =0; 
        int temp=0;
        int carry=0;
        int h=0;
        int last =0;
        
    
        if(n>m){
            int k=m-1;
        for(int i=n-1;i>=0 && i>=n-m;i--){
            sum+=arr1[i];
            sum+=arr2[k];
                k--;
            temp=sum%10;    
            sum/=10;
            if(sum!=0){
                arr[h]=temp+carry;
                h++;
                carry=sum;
                sum=0;}
            else{
                arr[h]=temp+carry;
                h++;
                carry=sum;}
            }
        for(int i=n-m-1;i>=1;i--){
                sum+=arr1[i];
            sum+=carry;
            temp=sum%10;    
                sum/=10;
                if(sum!=0){
                    arr[h]=temp;
                    h++;
                    carry=sum;
                    sum=0;
                     }
                   
                else{
                    arr[h]=temp;
                    h++;
                    carry=sum;}}
            
            last=arr1[0];
        }
        else{
            int k=n-1;
        for(int i=m-1;i>=0 && i>=m-n;i--){
            sum+=arr2[i];
            sum+=arr1[k];
                k--;
            temp=sum%10;    
            sum/=10;
            if(sum!=0){
                arr[h]=temp+carry;
                h++;
                carry=sum;
                sum=0;}
            else{
                arr[h]=temp+carry;
                h++;
                carry=sum;}
               
            }
            for(int i=m-n-1;i>=1;i--){
                sum+=arr2[i];
                sum+=carry;
                temp=sum%10;    
                sum/=10;
                if(sum!=0){
                    arr[h]=temp;
                    h++;
                    carry=sum;
                    sum=0;
                    }
                   
                else{
                    arr[h]=temp;
                    h++;
                    carry=sum;}}
            
            last=arr2[0];
           
        }
        
                if(n!=m){
                sum=last+carry;
                temp=sum%10;    
                    sum/=10;
                    if(sum!=0){
                        arr[h]=temp;
                        h++;
                        carry=sum;
                        arr[h]=carry;
                        h++;}                                          
                       
                    if(sum==0){
                        arr[h]=last+carry;
                        h++;
                        carry=sum;}}
                if(n==m){
                    if(carry!=0){
                    arr[h]=carry;
                    h++;}
                }        
       

        
            //to reverse the array 
            int j=0;
            int[] hello=new int[h];
            for(int i=h-1;i>=0;i--){
                hello[j]=arr[i];
               j++;}
               
            for(int i=0;i<h;i++){
                 System.out.print(hello[i]+", ");}
        
            System.out.print("END");
            sc.close();
    }
}
    


                

        
       
       
    



