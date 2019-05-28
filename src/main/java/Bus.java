public class Bus extends Vehicle{

    int numberOfSeats;

    public Bus(){
        super();
        numberOfSeats = 40;
    }

    @Override
    public void payment() {

    }

    public Bus(int numberOfSeats) {
        super();
        this.numberOfSeats = numberOfSeats;
    }

    public Bus(String registrationNumber, int numberOfSeats) {
        super(registrationNumber);
        this.numberOfSeats = numberOfSeats;
    }

    public Bus(String registrationNumber, String color, int numberOfWheels, int numberOfSeats) {
        super(registrationNumber, color, numberOfWheels);
        this.numberOfSeats = numberOfSeats;
    }
}
