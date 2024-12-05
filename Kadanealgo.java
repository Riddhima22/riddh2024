public class Kadanealgo {
    
        static void display(int[] arr){
            for(int i:arr)
                System.out.print(i+" ");
        }
        //Selection sort
        static void selectionSort(int[] arr){
    int currsum=0;
        int Maxsum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            Maxsum = Math.max(currsum,Maxsum);
            System.out.println(Maxsum);
            if(currsum<0){
                currsum=0;
}
        }
    }
    public static void main(String[] args) {
        int[] arr= {1,6,9,-2};
        selectionSort(arr);
        }
    }