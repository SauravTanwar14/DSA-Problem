package Method_Reference;

//Reference to an Instance Method
//like static methods, you can refer instance methods also.
// In the following example, we are describing the process of referring the instance method.

interface Sayable{

    public void say();
}

public class MethodRefrence3 {


    public void saySomething(){
        System.out.println("Hello, this is non-static");
    }

    public static void main(String[] args) {
        
        MethodRefrence3 instance = new MethodRefrence3();

        // Referring non-static method using reference
        Sayable sayable = instance::saySomething;

        sayable.say();
    }
}
