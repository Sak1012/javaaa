import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class StudentDataManipulation {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        // Add student records
        studentList.add(new Student(101, "Alice", 20));
        studentList.add(new Student(102, "Bob", 22));
        studentList.add(new Student(103, "Charlie", 19));
        studentList.add(new Student(104, "David", 21));
        studentList.add(new Student(105, "Eva", 23));

        // Search for a student by ID
        int searchId = 103;
        for (Student student : studentList) {
            if (student.getId() == searchId) {
                System.out.println("Found Student by ID " + searchId + ": " + student);
                break;
            }
        }

        // Sort students by age
        Collections.sort(studentList, (s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));
        System.out.println("\nSorted Students by Age:");
        studentList.forEach(System.out::println);

        // Filter students above a certain age
        int filterAge = 21;
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getAge() > filterAge) {
                filteredStudents.add(student);
            }
        }
        System.out.println("\nStudents above " + filterAge + " years old:");
        filteredStudents.forEach(System.out::println);
    }
}

