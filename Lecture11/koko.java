package Lecture11;

import java.util.Arrays;

public class koko {
    static boolean check(int k,int[] arr,int hour){
       int time=0;
       
       //int hello=arr[0];
        for(int i=1;i<arr.length;i++){
          /*  if(hello!=0){
            if(hello<k){
            time++;              check whats wrong with green(your)code
            hello=arr[i];
            }
            else{
                
                time+=(hello/k);
                hello%=k;
                
            }}*/
        time+=arr[i]/k;
        if(arr[i]%k!=0){
            time++;
        }

        }

        return(time<=hour);
     }

     static int Magneticballs(int[] arr,int hour){
        Arrays.sort(arr);
        int low=1;
        int high=arr[arr.length-1];
        int ans=-1;
       
        while(low<=high){
            int mid=high-(high-low)/2;
            if(check(mid,arr,hour)){
                ans=mid;
                high=mid-1;
                
            }
            else{
                low=mid+1;
               }   
        }
        return ans;
     }
     public static void main(String[] args) {
        int[] arr= {3,6,7,11};  
        System.out.println(Magneticballs(arr,8));
         }
    
}

