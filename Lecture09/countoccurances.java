package Lecture09;

public class countoccurances {
    static void count(int[] arr, int num){
        int l=lowerbound(arr,num);
        int h=upperbound(arr,num);
        System.out.println(h-l);
    }
    public static void main(String[] args) {  
        int[] arr= {1,1,1,2,2,2,3,4,4};
        count(arr,2);
        }
    

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

     public static int upperbound(int[] arr,int num){
        
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==num){
                ans=mid+1;
                low=mid+1;
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
    }