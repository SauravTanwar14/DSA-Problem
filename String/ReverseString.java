package String;

public class ReverseString {

    public static void main(String[] args) {
        
        String str ="Hello world";
        String rev = reverse(str);
        System.out.println(rev);
    }

    private static String reverse(String str) {
        if (str == null) {
            return null;
        }
        char chr[] = str.toCharArray();
        int left=0;
        int right = chr.length-1;

        while(left<right){
            char temp =chr[left];
            chr[left]= chr[right];
            chr[right]=temp;

            left++;
            right--;
        }
        return new String(chr);
    }
}
