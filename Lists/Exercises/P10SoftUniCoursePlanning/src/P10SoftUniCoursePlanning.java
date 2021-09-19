import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> lessons = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("course start")) {
            String[] command = input.split(":");
            String exercise = "";

            switch (command[0]) {
                case "Add":
                    if (!lessons.contains(command[1])) {
                        lessons.add(command[1]);
                    }
                    break;
                case "Insert":
                    if (!lessons.contains(command[1])) {
                        int index = Integer.parseInt(command[2]);
                        if (index >= 0) {
                            lessons.add(index, command[1]);
                        }
                    }
                    break;
                case "Remove":
                    exercise = command[1] + "-Exercise";
                    lessons.remove(command[1]);
                    lessons.remove(exercise);
                    break;
                case "Swap":
                    int firstIndex = getIndexOf(command[1], lessons);
                    int secondIndex = getIndexOf(command[2], lessons);

                    if (firstIndex >= 0 && secondIndex >= 0) {
                        String tempLesson = lessons.get(firstIndex);
                        lessons.set(firstIndex, lessons.get(secondIndex));
                        lessons.set(secondIndex, tempLesson);

                        exercise = command[1] + "-Exercise";
                        int exerciseIndex = getIndexOf(exercise, lessons);
                        if (exerciseIndex >= 0) {
                            lessons.remove(exerciseIndex);
                            firstIndex = getIndexOf(command[1], lessons);
                            lessons.add(firstIndex + 1, exercise);
                        }
                        exercise = command[2] + "-Exercise";
                        exerciseIndex = getIndexOf(exercise, lessons);
                        if (exerciseIndex >= 0) {
                            lessons.remove(exerciseIndex);
                            secondIndex = getIndexOf(command[2], lessons);
                            lessons.add(secondIndex + 1, exercise);
                        }
                    }

                    break;
                case "Exercise":
                    exercise = command[1] + "-Exercise";

                    int lessonIndex = getIndexOf(command[1], lessons);

                    if (lessonIndex < 0) {
                        lessons.add(command[1]);
                        lessons.add(exercise);
                    } else  {
                        int exerciseIndex = getIndexOf(exercise, lessons);
                        if (exerciseIndex < 0) {
                            lessons.add(lessonIndex + 1, exercise);
                        }
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < lessons.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, lessons.get(i));
        }
    }

    private static int getIndexOf(String valueOfElement, List<String> lessons) {
        for (int i = 0; i < lessons.size(); i++) {
            if (lessons.get(i).equals(valueOfElement)) {
                return i;
            }
        }
        return -1;
    }
}
