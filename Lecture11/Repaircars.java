package Lecture11;

import java.util.Arrays;

public class Repaircars {
    static boolean check(long mins,int[] rank,int num){
        int count=0;
       
        for(int i=0;i<rank.length;i++){   
            for(int j=1;j<=num;j++){
            if(rank[i]*j*j<=mins){
              
                count++;
            }
        }

        }
        return(count>=num);
     }
 
     /* sir's code:
     static boolean check(int mins,int[] rank,int num){
        int count=0;
       
        for(int i=0;i<rank.length;i++){ 
        count+=Math.sqrt(time/arr[i]);}
        count++;
            }
    
      */
     static long repaircars(int[] rank,int num){
        Arrays.sort(rank);
        long low=1;
        long high=rank[rank.length-1]*num*num;
        long ans=-1;
       
        while(low<=high){
            long mid=high-(high-low)/2;
            if(check(mid,rank,num)){
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
        int[] basket= {5,1,8};  
        System.out.println(repaircars(basket,6));
         }
    
    
}
