import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> companies = new TreeMap<>();

        while (!input.equals("End")) {
            String[] inputData = input.split(" -> ");
            String companyName = inputData[0];
            String employeeId = inputData[1];

            if (!companies.containsKey(companyName)) {
                companies.put(companyName, new ArrayList<>());
            }

            List<String> employees = companies.get(companyName);

            if (!employees.contains(employeeId)) {
                employees.add(employeeId);
                companies.put(companyName, employees);
            }
            input = scanner.nextLine();
        }

        companies.forEach( (key, value) -> {
            System.out.println(key);
            value.forEach(employee -> System.out.println("-- " + employee));
        });
    }
}
