/*public class rotate {
    static void display(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
    }
    static void shift(int[] arr){
    int key =arr[arr.length -1];
    
    //for(int j=0; j<k;j++){
        for (int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];

        }
        arr[0]=key;}

public static void main(String[] args) {
    int[] arr= {1,6,9,-2};
    shift(arr);
    display(arr);
    }
}



public void rotate(int[] nums, int k) {
    int[] temp= new int[nums.length];
    int n = nums.length;
    k%=n;
    for(int i=0;i<k;i++){
          temp[i]=nums[n-k+i];}

    for(int i=0;i<n-k;i++){
          temp[k+i]=nums[i];}
     for (int i = 0; i < nums.length; i++) {
         System.out.print(temp[i] + " ");}
}



int n=  nums.length;
int[] num1= new int[k];
int[] num2= new int[n-k];
int[] temp= new int[n];
for(int i=0;i<n;i++){
    temp[i]=nums[n-i-1];

}
for(int i=0;i<k;i++){
    num1[i]=temp[k-i-1];
}
for(int i=0;i<n-k;i++){
    num1[k+i]=temp[n-i-1];*/
