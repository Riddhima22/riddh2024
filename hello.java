public class hello{ /*
    public static void main(String[] args) {
        //third method of rotation
        int nums[]={1,2,3,4,5};
        int k=3;
        int n= nums.length;
         int[] num1= new int[n];
        
        int[] temp= new int[n];
        for(int i=0;i<n;i++){
              temp[i]=nums[n-i-1];

}
           for(int i=0;i<k;i++){
          num1[i]=temp[k-i-1];
}
        for(int i=0;i<n-k;i++){
             num1[k+i]=temp[n-i-1];

}
           for (int i = 0; i < nums.length; i++) {
                 System.out.print(num1[i] + " ");}
    
    

}
}*/


static void reverse(int[] nums, int i, int j){
    while(i<j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;j--;
    }
}

public static void rotate(int[] nums,int k){
    k%=nums.length;
    reverse(nums,0,nums.length-1);
    reverse(nums,0,k-1);
    reverse(nums,k,nums.length-1);
}
}
