import javax.swing.text.StyledDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int rollno;
    String name;

    Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }

    @Override
    public String toString() {
        return  rollno +
                ":" + name ;
    }
}
class SorttByRoll implements Comparator<Student> {
    @Override
            public int compare(Student s1,Student s2){
                return s1.rollno-s2.rollno;
            }
}
public class ComparatorDemo {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1,"John"));
        students.add(new Student(3,"Bob"));
        students.add(new Student(2,"Alice"));

        Collections.sort(students, new SorttByRoll());
        System.out.println(students);
    }
}
