package Array;

public class ProductExceptSelf {

    //optimise
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        int [] suffix = new int[n];
        int [] prefix = new int[n];

        prefix[0]=1;
        for(int i=1;i<n;i++){
            prefix[i]= prefix[i-1]*nums[i-1];
        }

        suffix[n-1]=1;
        for(int i=n-2;i>=0;i--){
            suffix[i] = suffix[i+1]*nums[i+1];
        }

        for(int i=0;i<n;i++){
            result[i] = suffix[i] * prefix[i];
        }

        return result;

    }

    //space optimization
    public static int[] productExceptSelfSpaceOptimized(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int R = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * R;
            R *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = productExceptSelfSpaceOptimized(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }

        int[] arr = {10, 3, 5, 6, 2};
        int result1[] =productExceptSelf(arr);

        for (int num : result1) {
            System.out.print(num + " ");
        }

    }
}
