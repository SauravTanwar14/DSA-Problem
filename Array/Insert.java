package Array;

import java.util.Arrays;

//Array insert at index

public class Insert {

    public static int[] insert(int arr[],int x,int index){

        

        int temp[] = new int[arr.length+1];

        

        for(int i=0;i<temp.length;i++){

            if(i==index){

                temp[i]= x;

            }
            else if(i<index){
                temp[i] = arr[i];
            }
            else{

                temp[i] = arr[i-1];

            }
        }
        return temp;
    }

    //efficient or optimalapproach
    public void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        for (int i = sizeOfArray - 1; i > index; i--) {
        arr[i] = arr[i - 1];
    }
    // Insert the new element at the specified index
    arr[index] = element;
    }
    
    public static void main(String[] args) {
        
        int arr[] ={1,2,3,4,5};

        int index =2;

        int x =10;

        System.out.println("Initial array"+Arrays.toString(arr));

       int newArr[]= insert(arr, x, index);

        System.out.println("Array with  "+ x +" insereted at position "+ index+Arrays.toString(newArr));

       
    }

}
