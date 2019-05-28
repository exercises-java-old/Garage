public class Bus extends Vehicle{

    int numberOfSeats;

    public Bus(){
        super();
        numberOfSeats = 40;
    }


    public Bus(int numberOfSeats) {
        super();
        this.numberOfSeats = numberOfSeats;
    }

    public Bus(String registrationNumber, int numberOfSeats) {
        super(registrationNumber);
        this.numberOfSeats = numberOfSeats;
    }

    public Bus(String registrationNumber, Color color, int numberOfWheels, int numberOfSeats) {
        super(registrationNumber, color, numberOfWheels);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void park(Garage garage) {
        int emptySlot = garage.findParkingLot(Vehicle.BUS);
        if(emptySlot != -1){
            garage.park(this, emptySlot);
        }
    }


}
