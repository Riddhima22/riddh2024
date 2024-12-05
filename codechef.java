import java.util.Scanner;

class Codechef /*{
	public static void main (String[] args){
	    Scanner read= new Scanner(System.in);
        int num= read.nextInt();
        boolean R= true;
        int n=2;
        while (n<num){
            if(num%n==0){
                R= false; 
                }
            n++;

            }
            if (R){
                System.out.println("prime");
                
            }
            else {
                System.out.println("not a  Prime");
                
                 
            }
        }
        }
{
        public static void main (String[] args){
            int[] arr1 ={1,2,3,4,5};
            int[] arr2 ={6,7,8};
            int array[]= new int[8];
            for(int i=0;i<arr1.length;i++){
                array[i]=arr1[i];}
            for(int i=0;i<arr2.length;i++){
                    array[i+arr1.length]=arr2[i];}
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
                    }
            

        }

}*/

{
    public static void main (String[] args){
        Scanner read= new Scanner(System.in);
		int N= read.nextInt();
		
		int arr[]= new int[N+2];
	    
		for(int i=0;i<arr.length-1;i++){
		    arr[i+1]=read.nextInt();
		}
		int X= read.nextInt();

		arr[0]=X;

		arr[arr.length-1]=X;
		for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");}
		
		
}
}



/*{
    public static void main (String[] args) 
	{
		Scanner read= new Scanner(System.in);
		int N= read.nextInt();
		
		
		int[] arr= new int[N];
		int[] array= new int[N];
		
		
		for(int i=0;i<arr.length;i++){
		    arr[i]=read.nextInt();
		}
		
		int X= read.nextInt();
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=X){
                array[j]=arr[i];
                j++;
                
                
            }
        }


        for (int i = 0; i < j; i++) {
                System.out.print(array[i] + " ");}
	}
}*/


	



