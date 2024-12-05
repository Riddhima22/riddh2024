package Lecture11;
import java.util.Arrays;

public class magneticballs {
    
    static boolean check(int force,int[] basket,int num){
        int count=1;
        int last_basket=basket[0];

        for(int i=1;i<basket.length&&count<num;i++){
            if(basket[i]-last_basket>=force){
                last_basket=basket[i];//to put the ball into basket
                count++;
            }

        }
        return(count>=num);
     }
     static int Magneticballs(int[] basket,int num){
        Arrays.sort(basket);
        int low=1;
        int high=basket[basket.length-1]-basket[0];
        int ans=-1;
       
        while(low<=high){
            int mid=high-(high-low)/2;
            if(check(mid,basket,num)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;}   
        }
        return ans;
     }
     public static void main(String[] args) {
        int[] basket= {1,2,3,4,7};  
        System.out.println(Magneticballs(basket,3));
         }
    
}
