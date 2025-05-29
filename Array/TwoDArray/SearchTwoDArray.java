package Array.TwoDArray;

//Array is sorted 
public class SearchTwoDArray {

    public static void main(String[] args) {
        
        int arr[][]= {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11,12}
    };

    int target=10;
    int i=0;
    int j=arr[0].length-1;
    int flag=0;

   while (i<arr.length && j>=0) {

    if(arr[i][j]==target){
        flag=1;
        System.out.println("target is found at ["+ i +""+j+"]");
        break;
    }else if(arr[i][j]>target){
        j--;
    }else{
        i++;
    }
    
   }

   if(flag==0){
    System.out.println("Target is not found");
   }
}
}
