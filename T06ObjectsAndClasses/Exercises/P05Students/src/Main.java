import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < numberOfStudents; i++) {
            String[] studentData = scanner.nextLine().split(" ");
            String firstName = studentData[0];
            String lastName = studentData[1];
            double grade = Double.parseDouble(studentData[2]);
            Student newStudent = new Student(firstName, lastName, grade);
            students.add(newStudent);
        }

        students.sort(Comparator.comparing(Student::getGrade));
        Collections.reverse(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
