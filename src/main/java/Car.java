public class Car extends Vehicle{

    private int cylinderVolume;

    public Car(){
        super();
        cylinderVolume = 4;
    }

    public Car(String registrationNumber){
        super(registrationNumber);
        cylinderVolume = 4;
    }

    public Car(String registrationNumber, String color, int numberOfWheels, int cylinderVolume) {
        super(registrationNumber, color, numberOfWheels);
        this.cylinderVolume = cylinderVolume;
    }

    public void payment(){

    }

}