package Array;

public class TrappingRainWater {

    static int trappingWater(int arr[],int n){

        int res=0;

        int lmax[] = new int[n];
        int rmax[] = new int[n];

        lmax[0]=arr[0];
        for(int i=1;i<n;i++){
          lmax[i]=Math.max(arr[i],lmax[i-1]);
        }



          rmax[n-1]=arr[n-1];
            for(int j=n-2;j>=0;j--){
                rmax[j] = Math.max(arr[j],rmax[j+1]);
            }

            for(int i = 1; i < n - 1; i++)
    		res = res + (Math.min(lmax[i], rmax[i]) - arr[i]);
        
            return res;

    }
    public static void main(String args[]) 
    { 
       int arr[] = {5, 0, 6, 2, 3}, n = arr.length;

      System.out.println( "total water trap "+trappingWater(arr, n));

    } 

}
