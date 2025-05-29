package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
    String name;
    int rollno;
    int age;

    Student(String name, int rollno,int age){
        this.name=name;
        this.rollno=rollno;
        this.age=age;
    }
}
public class UserDefineObject {
public static void main(String[] args) {
    Student s1 = new Student("Saurav", 27, 27);
    Student s2 = new Student("Gaurav", 25, 25);
    Student s3 = new Student("Riddhi", 2, 4);

    ArrayList<Student> st = new ArrayList<Student>();

    st.add(s1);
    st.add(s2);
    st.add(s3);


    Iterator itr = st.iterator();

    while(itr.hasNext()){
       Student stu = (Student) itr.next();
       System.out.println(stu.name+" "+stu.rollno+" "+stu.age);
    }
}
}
