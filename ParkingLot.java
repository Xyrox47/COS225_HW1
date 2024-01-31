package COS225_HW1;

import java.lang.reflect.Array;

public class ParkingLot {
    public ParkingSpot[] spots;
    public Car parkingCar;
    
    public ParkingLot(){
        this.spots = new ParkingSpot[10];
        for (int i = 0;i <10; i++){
            if (i <= 1){
                this.spots[i] = new ParkingSpot(true);
            }
            else{
                this.spots[i] = new ParkingSpot(false);
            }
        }

    }

    public String toString(){
        return "";
    }
    public int ParkCar(Car parkingCar){
        if (parkingCar.handicap = true){
            System.out.println("True");
        }
        spots[0].parkedCar = parkingCar;
        System.out.println(spots[0].parkedCar.make);

        

        return 1;

    }
}
