package GeeksProblem;

public class MajorityElements {

    public static int majorityElements(int arr[],int n){

        int count =0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }

        if(count > n/2){
            return count;
        }
        else
        return -1;

    }

    public static void main(String[] args) {
        int arr[]={15};
        int n = arr.length;

        System.out.println("majority "+majorityElements(arr, n));
    }

}
