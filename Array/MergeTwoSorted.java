package Array;

public class MergeTwoSorted {

    
    // 
    // Approach:
// Use three pointers:

// p1 pointing to the last element of the meaningful part of nums1 (i.e., m - 1).
// p2 pointing to the last element of nums2 (i.e., n - 1).
// p pointing to the last index of nums1 (i.e., m + n - 1).
// Start filling nums1 from the end (starting at p) by comparing the elements at p1 and p2.

// If nums1[p1] is greater than nums2[p2], place nums1[p1] at nums1[p] and move p1 left.
// Otherwise, place nums2[p2] at nums1[p] and move p2 left.
// Move p left in each iteration.
// After processing one of the arrays, there might be some remaining elements in nums2. If so, copy them into the beginning of nums1.
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int p1= m-1;
        int p2= n-1;
        int p = m+n-1;

        while (p1>=0 && p2>=0) {

            if(nums1[p1] > nums2[p2]){
                nums1[p]=nums1[p1];
                p1--;
            }else{
                nums1[p]=nums2[p2];
                p2--;
            }
            p--;
            
        }

        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
}
public static void main(String[] args) {
    int nums1[] = {1, 2, 3, 0, 0, 0};
   int m = 3;
   int  nums2 [] = {2,5,6};
   int  n = 3;

   merge(nums1,m,nums2,n);

   for(int i=0;i<m+n;i++){
    System.out.print(nums1[i]+" ");
   }
}
}
