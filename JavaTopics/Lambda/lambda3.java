package Lambda;

interface Sayable{
    public String say(String name);
}
public class lambda3 {

    public static void main(String[] args) {
        
        Sayable s = (name)-> {
            return "Hello "+name;
        };

        System.out.println(s.say("saurav"));
    }
}
