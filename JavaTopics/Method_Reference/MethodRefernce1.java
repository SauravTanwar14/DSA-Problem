package Method_Reference;

// Reference to a Static Method
//You can refer to static method defined in the class. 
//Following is the syntax and example which describe the process of referring static method in Java.

/**
 *  Sayable
 */
 interface  Sayable {

    public void say();
    
}
public class MethodRefernce1 {

    public static void saySomething(){
        System.out.println("Hello, this is a static method");
    }
    
    public static void main(String[] args) {
        Sayable s1 = MethodRefernce1::saySomething;
        s1.say();
}
    }

    
