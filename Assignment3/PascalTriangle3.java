package Assignment3;

import java.util.Scanner;

public class PascalTriangle3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        
        
       
        int[] arr=new int[3628800];
        int x=0;
        int c=0;
        int s=0;
        for(int i=1;i<=n;i++){
            
            int count=0;
            int count1=0;
            int sum=0;
            int sum1=0;
            
            for(int j=1;j<=i;j++){
                
                if(j==1 || j==i){
                    x=1;
                    System.out.print("1    ");
                }
                
                else{
                    x=arr[s];
                    for(int p=1;p<=1;p++){
                        System.out.print(arr[s]+"    ");
                        
                        s++;
                    }
                   
            }
            count1++;
            count++;
            
            sum+=x;
            if(count==2){
                
                 arr[c]=sum;
                
                sum1+=x;
                count=0;
                sum=0;
                c++;
        
            }

            if(count1==3){
                sum1+=x;
                
                 arr[c]=sum1;
                 c++;
                
                sum1=0;
                count1=1;   
            }
            
            
            }
            
        
            System.out.println();
        }

        sc.close();
    
    
}
}

