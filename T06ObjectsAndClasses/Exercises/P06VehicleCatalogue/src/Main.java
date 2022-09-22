import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicleCatalogue = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] commandData = input.split(" ");

            Vehicle newVehicle = new Vehicle(commandData[0],
                    commandData[1],
                    commandData[2],
                    Integer.parseInt(commandData[3]));

            vehicleCatalogue.add(newVehicle);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("Close the Catalogue")) {

            PrintVehicleByModel(input, vehicleCatalogue);

            input = scanner.nextLine();
        }

        double averageHorsePower = CalculateAverageHorsePowerByTypeOfVehicle("car", vehicleCatalogue);
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageHorsePower);
        averageHorsePower = CalculateAverageHorsePowerByTypeOfVehicle("truck", vehicleCatalogue);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageHorsePower);
    }

    private static double CalculateAverageHorsePowerByTypeOfVehicle(String vehicleType, List<Vehicle> vehicleCatalogue) {
        double totalHorsePower = 0;
        int numberOfVehicles = 0;
        for (Vehicle vehicle : vehicleCatalogue) {
            if (vehicleType.equals(vehicle.getType())) {
                numberOfVehicles++;
                totalHorsePower += vehicle.getHorsePower();
            }
        }
        if (numberOfVehicles == 0)
            return 0;
        return totalHorsePower / numberOfVehicles;
    }

    public static void PrintVehicleByModel(String model, List<Vehicle> vehicleCatalogue) {
        for (Vehicle vehicle : vehicleCatalogue) {
            if (model.equals(vehicle.getModel())) {
                System.out.println(vehicle);
                return;
            }
        }
    }
}
