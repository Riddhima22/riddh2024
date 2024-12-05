public class NGER /*{
    public static void main(String[] args) {
        
    //NGEL
    int arr[]={7,8,5,6,3,4,1,2};
    int M=0;
    int[] ngel = new int[arr.length];

    for(int i=0;i<arr.length;i++){
        ngel[i]=M;
        M=Math.max(M,arr[i]);
    }

    for (int j = 0; j < ngel.length; j++) {
        System.out.print(ngel[j] + " ");}
}
}*/

{public static void main(String[] args) {
        
    //NGER
    int arr[]={7,8,5,6,3,4,1,2};
    int M=0;
    int[] nger = new int[arr.length];

    for(int i=arr.length-1;i>=0;i--){
        nger[i]=M;
        M=Math.max(M,arr[i]);
    }

    for (int j = 0; j < nger.length; j++) {
        System.out.print(nger[j] + " ");}
}
}