package COS225_HW1;

public class ParkingTester {
    ParkingLot parkingLot;
    public static void main(String []args){
        ParkingLot parkingLot1 = new ParkingLot();
        Car Toyoto = new Car("Accord","Toyota", true);
        parkingLot1.ParkCar(Toyoto);
    }
}