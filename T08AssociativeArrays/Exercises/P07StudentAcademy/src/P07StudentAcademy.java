import java.util.*;

public class P07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfInputLines = Integer.parseInt(scanner.nextLine());

        Map<String, Student> students = new LinkedHashMap<>();

        for (int i = 0; i < numberOfInputLines; i++) {
            String studentName = scanner.nextLine();

            if (!students.containsKey(studentName)) {
                students.put(studentName, new Student(new ArrayList<>()));
            }

            Student studentGrades = students.get(studentName);
            studentGrades.addGrade(Double.parseDouble(scanner.nextLine()));
            students.put(studentName, studentGrades);
        }

        students.entrySet().stream()
                .filter(e -> e.getValue().getAverage() >= 4.50)
                .sorted((e2, e1) -> Double.compare(e1.getValue().getAverage(), e2.getValue().getAverage()))
                .forEach(student -> System.out.printf("%s -> %.2f%n", student.getKey(), student.getValue().getAverage()));
    }
}
