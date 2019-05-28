import java.util.ArrayList;

public interface GarageInterface {

    void park(Vehicle vehicle);

    void unpark(Vehicle vehicle);

    boolean findVehicleByRegistrationNumber(String registrationNumber);

    //to print out their properties
    String getVehicles();

    ArrayList<String> getTypesParked();

    void setMaxCapacity(int maxCapacity);

}
