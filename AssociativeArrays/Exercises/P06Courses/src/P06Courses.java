import java.util.*;

public class P06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String[] inputData = input.split(" : ");
            String courseName = inputData[0];
            String newStudent = inputData[1];

            if (!courses.containsKey(courseName)) {
                courses.put(courseName, new ArrayList<>());
            }
            List<String> currentStudents = courses.get(courseName);
            currentStudents.add(newStudent);

            courses.put(courseName, currentStudents);

            input = scanner.nextLine();
        }

        courses.entrySet()
                .stream()
                .sorted((e2, e1) -> Integer.compare(e1.getValue().size(),e2.getValue().size()))
                .forEach(entry -> {
                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());

                    entry.getValue().stream()
                            .sorted()
                            .forEach(e -> System.out.printf("-- %s%n", e));
                });
    }
}
