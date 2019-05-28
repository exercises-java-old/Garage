import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Garage implements GarageInterface{

    private int maxCapacity = 96;

    private Map<Integer, Vehicle> vehicles = new HashMap<>(maxCapacity);

    public void park(Vehicle vehicle) {

    }

    public void unpark(Vehicle vehicle) {

    }

    public boolean findVehicleByRegistrationNumber(String registrationNumber){
        List<Vehicle> temp = (ArrayList)vehicles.values();
        for(Vehicle vehicle : temp){
            if(vehicle.getRegistrationNumber().equals(registrationNumber)){
                return true;
            }
        }
        return false;
    }

    public String getVehicles() {
        return null;
    }

    @Override
    public ArrayList<String> getTypesParked() {
        return null;
    }

    public void setMaxCapacity(int maxCapacity){
        if(maxCapacity <= 0) throw new IllegalArgumentException("The capacity may not be less than 1");
        this.maxCapacity = maxCapacity;
    }

}
