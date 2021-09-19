import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDoNotGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pokemons = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        while (!pokemons.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());
            if (index < 0) {
                sum += pokemons.get(0);
                increaseAllElements(pokemons.get(0), pokemons);
                pokemons.set(0, pokemons.get(pokemons.size()-1));
            } else if (index >= pokemons.size()) {
                sum += pokemons.get(pokemons.size()-1);
                increaseAllElements(pokemons.get(pokemons.size()-1), pokemons);
                pokemons.set(pokemons.size()-1, pokemons.get(0));
            } else {
                sum += pokemons.get(index);
                increaseAllElements(pokemons.get(index), pokemons);
                pokemons.remove(index);
            }
        }
        System.out.println(sum);
    }

    public static void increaseAllElements(int valueToIncrease, List<Integer> listWithElements)
    {
        for (int i = 0; i < listWithElements.size(); i++) {
            if (listWithElements.get(i) <= valueToIncrease) {
                listWithElements.set(i, listWithElements.get(i) + valueToIncrease);
            } else {
                listWithElements.set(i, listWithElements.get(i) - valueToIncrease);
            }
        }
    }
}
