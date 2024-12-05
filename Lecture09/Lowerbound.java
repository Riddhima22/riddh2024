package Lecture09;

public class Lowerbound {
    public static int lowerbound(int[] arr,int num){
        
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==num){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]<num){
                low=mid+1;
            
            }
            else{
                high=mid-1;
            }
            
        }
        return ans;
     }
     public static void main(String[] args) {  
        int[] arr= {1,1,1,2,2,2,3,4,4};
        System.out.println(lowerbound(arr,2));
        }
    }
    
