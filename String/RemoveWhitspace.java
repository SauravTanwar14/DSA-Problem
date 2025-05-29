package String;

public class RemoveWhitspace {

    public static void main(String[] args) {
        
        String str=" Java is programming lang";

        String  op=" ";

        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);

            if(!Character.isWhitespace(ch))
            {
                op= op + ch;
            }
        }
        System.out.println(op);
    }
}
