import java.io.*;
import java.util.*;

public class Garage implements GarageInterface{

    private static String filePath = "C:\\Users\\zgrkbr\\git\\Garage\\garage.kib";

    private int maxCapacity = 96;

    private int currentParkingLot = 1;

    private Map<Integer, Vehicle> vehicles = new HashMap<>(maxCapacity);

    public int park(Vehicle vehicle) {
        if(currentParkingLot <= maxCapacity) {
            vehicle.setParkinglotNumber(currentParkingLot);
            vehicles.put(currentParkingLot, vehicle);
        }
        return ++currentParkingLot;
    }

    public void unpark(Vehicle vehicle) {
        vehicles.remove(vehicle.getParkinglotNumber());
        vehicle.setParkinglotNumber(0);
    }

    public Vehicle getVehicleByRegistrationNumber(String registrationNumber){
        Collection<Vehicle> temp = vehicles.values();
        for(Vehicle vehicle : temp){
            if(vehicle.getRegistrationNumber().equals(registrationNumber)){
                return vehicle;
            }
        }
        return new EmptyVehicle();
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

    public void save(){
        File file = new File(filePath);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(this);
            System.out.println("Success!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed to write.");
        }
    }//save

    public static Garage load(){
        Garage temp = null;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
            temp = (Garage)ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("Load error");
        } catch (ClassNotFoundException e){
            System.out.println("Impossible error");
        }
        return temp;
    }//load

}
