import java.util.*;

public class P10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> usersAndPoints = new LinkedHashMap<>();
        Map<String, Integer> submissions = new LinkedHashMap<>();

        List<String> bannedUsers = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("exam finished")) {
            String[] inputData = input.split("-");
            String userName = inputData[0];

            if (inputData.length == 3) {
                String language = inputData[1];
                Integer points = Integer.parseInt(inputData[2]);

                if (!bannedUsers.contains(userName)) {
                    if (!usersAndPoints.containsKey(userName)) {
                        usersAndPoints.put(userName, 0);
                    }
                    if (points > usersAndPoints.get(userName)) {
                        usersAndPoints.put(userName, points);
                    }
                }

                if (!submissions.containsKey(language)) {
                    submissions.put(language, 0);
                }

                Integer submissionsNumber = submissions.get(language);
                submissionsNumber++;
                submissions.put(language, submissionsNumber);
            } else if (inputData.length == 2) {
                if (inputData[1].equals("banned")) {
                    if (!bannedUsers.contains(userName)) {
                        bannedUsers.add(userName);
                    }
                    usersAndPoints.remove(userName);
                }
            }

            input = scanner.nextLine();
        }

        System.out.println("Results:");
        usersAndPoints.entrySet().stream()
                .sorted((entry1, entry2) -> {
                    int result = Integer.compare(entry2.getValue(), entry1.getValue());
                    if (result == 0) {
                        result = entry1.getKey().compareTo(entry2.getKey());
                    }
                    return result;
                })
                .forEach(entry -> System.out.println(entry.getKey() + " | " + entry.getValue()));

        System.out.println("Submissions:");
        submissions.entrySet().stream()
                .sorted((entry1, entry2) -> {
                    int result = Integer.compare(entry2.getValue(), entry1.getValue());
                    if (result == 0) {
                        result = entry1.getKey().compareTo(entry2.getKey());
                    }
                    return result;
                })
                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));

    }
}
