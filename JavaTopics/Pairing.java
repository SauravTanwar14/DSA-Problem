public class Pairing {

    static boolean pair(int arr[]){

        int n = arr.length;
        int count=0;

        if(n%2!=0 && n==0){
            return false;
        }

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }

            if(count==0)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        
        //int arr[]={1,2,1,2,3};
        int arr[]={};

        boolean result = pair(arr);

        System.out.println(result);
    }
}
