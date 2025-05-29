package Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<>();
        students.add(new Student(2, "Alex"));
        students.add(new Student(1, "James"));
        students.add(new Student(3, "Ponting"));

        Collections.sort(students);
        System.out.println("Sorted by Roll Number:");

        students.forEach(student -> System.out.println(student));

        // for (Student student : students) {
            
        //     System.out.println(student);
        // }
    }
}
