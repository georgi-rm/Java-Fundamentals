public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int horsePower;

    public Vehicle(String type, String model, String color, int horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        String vehicleType = "";
        if (type.equals("car")) {
            vehicleType = "Car";
        } else {
            vehicleType = "Truck";
        }

        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d", vehicleType, model, color, horsePower);
    }
}
