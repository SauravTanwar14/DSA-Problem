import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1
{
    String name;
    Integer age;

    // Constructor
    Student1(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    // Method to print student
    // details in main()
    @Override
    public String toString() {
        return name + " : " + age;
    }
}



class CustomerSortingComparator implements Comparator<Student1>{

    public int compare(Student1 s1,Student1 s2){

        int NameCompare =  s1.getName().compareTo(s2.getName());

        int AgeCompare = s1.getAge().compareTo(s2.getAge());

        return (NameCompare ==0) ? AgeCompare : NameCompare;
    }
}
public class ComparatorHelperClassExample {

    public static void main(String[] args)
    {
        List<Student1> students = new ArrayList<>();

        students.add(new Student1("Ajay", 27));
        students.add(new Student1("Sneha", 23));
        students.add(new Student1("Simran", 37));
        students.add(new Student1("Ankit", 22));
        students.add(new Student1("Anshul", 29));
        students.add(new Student1("Sneha", 22));

        // Original List
        System.out.println("Original List ");

        // Iterating List
        for (Student1 it : students) {
            System.out.println(it);
        }

        System.out.println();

        // Sort students by name, then by age
        // using the CustomerSortingComparator
        Collections.sort(students, new CustomerSortingComparator());

        // Display message only
        System.out.println("After Sorting ");

        // Iterating using enhanced for-loop
        // after Sorting ArrayList
        for (Student1 it : students) {
            System.out.println(it);
        }
    }
}
