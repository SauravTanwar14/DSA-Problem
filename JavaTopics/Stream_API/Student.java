package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Student {

    int roll;
    String name;
    int marks;

    Student(int r, String n, int m) {
        this.roll = r;
        this.name = n;
        this.marks = m;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

}

class Test {

    public static void main(String[] args) {

        Student arr[] = { new Student(1, "Saurav", 70),
                new Student(2, "Gaurav", 80),
                new Student(3, "Rahul", 60) };

        // Creating a map and loading it with
        // roll no and name of the student using
        // the Collectors.toMap() method
        Map<Integer, String> m = Arrays.stream(arr)
                .collect(Collectors.toMap(Student::getRoll, Student::getName));

        System.out.println(m);

        // Creating a map where marks are the keys
        // and students for every marks
        // here students are grouped according
        // to the marks
        Map<Integer, List<Student>> m1
        = Arrays.stream(arr)
                .collect(Collectors.groupingBy(
                    Student::getMarks));
        
        System.out.println(m1);
    }
}