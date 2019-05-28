public abstract class Vehicle {

    protected String registrationNumber;
    protected String color;
    protected int numberOfWheels;



    protected int parkinglotNumber;

    public Vehicle(){
        registrationNumber = "AAA111";
        color = "red";
        numberOfWheels = 4;
    }

    public Vehicle(String registrationNumber){
        this.registrationNumber = registrationNumber;
        color = "red";
        numberOfWheels = 4;
    }

    public Vehicle(String registrationNumber, String color, int numberOfWheels){
        this.registrationNumber = registrationNumber;
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }

    public abstract void payment();

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getParkinglotNumber() {
        return parkinglotNumber;
    }

    public void setParkinglotNumber(int parkinglotNumber) {
        this.parkinglotNumber = parkinglotNumber;
    }
}
