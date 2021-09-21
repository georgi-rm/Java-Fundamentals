import java.util.*;

public class P09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> sidesDb = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Lumpawaroo")) {
            String sideName = "";
            String forceUser = "";
            String[] inputData = input.split(" \\| ");

            if (inputData.length == 2) {
                sideName = inputData[0];
                forceUser = inputData[1];

                if (!CheckIfUserExists(forceUser, sidesDb)) {
                    AddUserInDb(sideName, forceUser, sidesDb);
                }
            } else {
                String[] inputDataChangeSides = input.split(" -> ");
                if (inputDataChangeSides.length == 2) {
                    forceUser = inputDataChangeSides[0];
                    sideName = inputDataChangeSides[1];

                    RemoveUserFromDb(forceUser, sidesDb);
                    AddUserInDb(sideName, forceUser, sidesDb);
                    System.out.println(forceUser + " joins the " + sideName + " side!");
                }
            }

            input = scanner.nextLine();
        }

        sidesDb.entrySet().stream()
                .filter(entry -> entry.getValue().size() > 0)
                .sorted((e1, e2) -> {
                    int result = Integer.compare(e2.getValue().size(), e1.getValue().size());
                    if (result == 0) {
                        return e1.getKey().compareTo(e2.getKey());
                    } else {
                        return result;
                    }
                })
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().stream().sorted().forEach(user -> System.out.println("! " + user));
                });
    }

    private static void AddUserInDb(String sideName, String user, Map<String, List<String>> dataBase) {
        if (!dataBase.containsKey(sideName)) {
            dataBase.put(sideName, new ArrayList<>());
        }

        List<String> users = dataBase.get(sideName);
        users.add(user);
        dataBase.put(sideName, users);
    }

    private static void RemoveUserFromDb(String user, Map<String, List<String>> dataBase) {
        for (Map.Entry<String, List<String>> entry : dataBase.entrySet()) {
            if (entry.getValue().contains(user)) {
                List<String> users = dataBase.get(entry.getKey());
                users.remove(user);
                dataBase.put(entry.getKey(), users);
                return;
            }
        }
    }

    public static boolean CheckIfUserExists(String user, Map<String, List<String>> dataBase) {
        for (Map.Entry<String, List<String>> entry : dataBase.entrySet()) {
            if (entry.getValue().contains(user)) {
                return true;
            }
        }
        return false;
    }

}
