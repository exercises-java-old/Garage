import org.junit.Test;

import static org.junit.Assert.*;

public class GarageTest {

    @Test
    public void park() {
        Garage testGarage = new Garage();
        Vehicle testVehicle1 = new Car("QWE542");
        Vehicle testVehicle2 = new Car("RTY412");

        testGarage.park(testVehicle2);

        for(int i=0; i<96; i++){
            testGarage.park(new EmptyVehicle());
        }

        testGarage.park(testVehicle1);
        assertNotSame( testVehicle1, testGarage.getVehicleByRegistrationNumber("QWE542"));
        assertSame(testVehicle2, testGarage.getVehicleByRegistrationNumber("RTY412"));

    }

    @Test
    public void unpark() {
        Garage testGarage = new Garage();
        Vehicle testVehicle1 = new Car("QWE542");
        Vehicle testVehicle2 = new Car("RTY412");

        testGarage.park(testVehicle1);
        testGarage.park(testVehicle2);

        testGarage.unpark(testVehicle2);

        assertSame(testVehicle1, testGarage.getVehicleByRegistrationNumber("QWE542"));
        assertNotSame(testVehicle2, testGarage.getVehicleByRegistrationNumber("RTY412"));
    }

    @Test
    public void getVehicleByRegistrationNumber() {
        Garage testGarage = new Garage();
        Vehicle testVehicle1 = new Car();
        Vehicle testVehicle2 = new Motorcycle("ASD123", "gasoline");

        testGarage.park(testVehicle1);
        testGarage.park(testVehicle2);

        assertSame(testVehicle2, testGarage.getVehicleByRegistrationNumber("ASD123") );
    }

    @Test
    public void getVehicles() {
    }

    @Test
    public void getTypesParked() {
    }

    @Test
    public void setMaxCapacity() {
    }

    @Test
    public void save() {
    }

    @Test
    public void load() {
    }
}