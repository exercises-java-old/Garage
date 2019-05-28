public abstract class Vehicle {

    protected String registrationNumber;

    protected int numberOfWheels;

    protected int parkinglotNumber;

    protected Color color;

    protected static int CAR = 1;
    protected static int MOTORCYCLE = 11;
    protected static int BUS = 21;

    public Vehicle(){
        registrationNumber = "AAA111";
        color = Color.PURPLE;
        numberOfWheels = 4;
    }

    public Vehicle(String registrationNumber){
        this.registrationNumber = registrationNumber;
        color = Color.RED;
        numberOfWheels = 4;
    }

    public Vehicle(String registrationNumber, Color color, int numberOfWheels){
        this.registrationNumber = registrationNumber;
        color = Color.RED;
        this.numberOfWheels = numberOfWheels;
    }

    public abstract void park(Garage garage);

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getParkinglotNumber() {
        return parkinglotNumber;
    }

    public void setParkinglotNumber(int parkinglotNumber) {
        this.parkinglotNumber = parkinglotNumber;
    }

    @Override
    public String toString() {
        return  "registrationNumber='" + registrationNumber + '\'' +
                ", color='" + color + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                ", parkinglotNumber=" + parkinglotNumber;
    }
}
