package COS225_HW1;

public class ParkingTester {
    ParkingLot parkingLot;
    public static void main(String []args){
        ParkingLot parkingLot1 = new ParkingLot();

        System.out.println(parkingLot1.toString());
        Car InfinitiA = new Car("A","Ifiniti", true);
        parkingLot1.ParkCar(InfinitiA);

        System.out.println(parkingLot1.toString());
        Car CadiliacB = new Car("B","Cadiliac", false);
        parkingLot1.ParkCar(CadiliacB);

        System.out.println(parkingLot1.toString());
        parkingLot1.RemoveCar(0);
        
        System.out.println(parkingLot1.toString());


    }
}