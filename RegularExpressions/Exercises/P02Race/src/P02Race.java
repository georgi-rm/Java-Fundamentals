import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> racers = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        Pattern patternName = Pattern.compile("[A-Za-z]");
        Pattern patternDistance = Pattern.compile("[0-9]");

        Map<String, Integer> racersDistance = new LinkedHashMap<>();

        while (!input.equals("end of race")) {
            StringBuilder nameOfRacer = new StringBuilder();
            int distance = 0;
            Matcher matcherName = patternName.matcher(input);
            while (matcherName.find()) {
                nameOfRacer.append(matcherName.group());
            }

            Matcher matcherDistance = patternDistance.matcher(input);
            while (matcherDistance.find()) {
                distance += Integer.parseInt(matcherDistance.group());
            }

            if (racers.contains(nameOfRacer.toString())) {
                if (racersDistance.containsKey(nameOfRacer.toString())) {
                    distance += racersDistance.get(nameOfRacer.toString());
                }
                racersDistance.put(nameOfRacer.toString(), distance);
            }

            input = scanner.nextLine();
        }

        List<String> namesOfFirstRacers = racersDistance.entrySet()
                .stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.printf("1st place: %s%n", namesOfFirstRacers.get(0));
        System.out.printf("2nd place: %s%n", namesOfFirstRacers.get(1));
        System.out.printf("3rd place: %s%n", namesOfFirstRacers.get(2));

    }
}
