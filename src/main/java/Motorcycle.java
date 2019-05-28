public class Motorcycle extends Vehicle {

    String fuelType;

    public Motorcycle(){
        super();
        fuelType = "gasoline";
    }

    public Motorcycle(String fuelType) {
        super();
        this.fuelType = fuelType;
    }

    @Override
    public void payment() {

    }

    public Motorcycle(String registrationNumber, String fuelType) {
        super(registrationNumber);
        this.fuelType = fuelType;
    }

    public Motorcycle(String registrationNumber, String color, int numberOfWheels, String fuelType) {
        super(registrationNumber, color, numberOfWheels);
        this.fuelType = fuelType;
    }
}
