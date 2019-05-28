import java.util.ArrayList;

public interface GarageInterface {

    int park(Vehicle vehicle);

    void unpark(Vehicle vehicle);

    Vehicle getVehicleByRegistrationNumber(String registrationNumber);

    //to print out their properties
    String getVehicles();

    ArrayList<String> getTypesParked();

    void setMaxCapacity(int maxCapacity);

}
