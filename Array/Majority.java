package Array;
public class Majority{


    //navie approach
    public static int majority(int arr[]){

        int n = arr.length;

        for(int i =0 ; i<n ; i++){

            int count =1;

            for(int j =i+1 ;j<n ; j++){
 
                if(arr[i] == arr[j]){
                    count++;
                }

            }
            if(count>n/2){
                return i;

            }

        }
        return -1;
    }

    //efficient approach

    static int findMajority(int arr[]){
        int n = arr.length;


        //finding a candidate
        int res =0, count = 1;

        for(int i =1 ; i<n ;i++){

            if(arr[res]== arr[i]){
                count++;
            }
            else{
                count--;
            }

            if(count == 0){
                res = i ;
                count =1;
            }
        }

        //checking the majority of candidate
        count = 0;

    	for(int i = 0; i < n; i++)
    		if(arr[res] == arr[i])
    			count++;

    	if(count <= n /2)
    		return -1;

    	return arr[res]; 


    }


    public static void main(String arg[]){

        int arr[] = {8, 7,6,8, 6, 6, 6, 6};

        //System.out.println("Majority in array: "+majority(arr));
        System.out.println("Majority in array: "+findMajority(arr));

    }
    
}
