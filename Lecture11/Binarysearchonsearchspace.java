package Lecture11;
//reaching centre on time with the safest speed
//given the time to reach and the distance

public class Binarysearchonsearchspace {
    static boolean check(int speed,int dist,int time){
       int dist_travelled=speed*time;
       return(dist_travelled>=dist);
    }

    static int reachcentre(int dist,int time){
        
        int low=0;
        int high=200;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(check(mid,dist,time)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;}   
        }
        return ans;
     }

     public static void main(String[] args) {  
        
       System.out.println(reachcentre(540,6));
        }
    
}
