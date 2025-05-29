package Array;

public class MajorityTwins {
    
	public static void main (String[] args) {
		int arr[] = {1,1,2,2,3,3,4,4,4,4,5};
        int n = arr.length;
         int  x = 4, y = 5;
         
         System.out.println(majorityTwins(arr,n,x,y));
	}
	
	public static int majorityTwins(int arr[], int n, int x, int y) {
       
       int count=1;
       int counter=1;
       
       for(int i=0;i<n;i++){
           
           if(arr[i]==x){
               count++;
           }
           else if(arr[i]==x){
               counter++;
           }
       }
       if(count == counter){
        if(x > y)
            return y;
        else
          return x;
   }
   
   if(count > counter)
        return x;
   return y;

}
}


