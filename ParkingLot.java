package COS225_HW1;

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
        int handicapOpen = 0;
        int otherOpen = 0;
        for (int i = 0; i < 10; i++){
            if (i <= 1){
                if (spots[i].parkedCar == null){
                    handicapOpen++;
                }
            }
            else if (i <= 10){
                if (spots[i].parkedCar == null){
                    otherOpen++;
                }
            }
        }
    
            return ""+handicapOpen+" "+ otherOpen;
        }


    
    public int ParkCar(Car parkingCar){
        if (parkingCar.handicap == true){
            for(int i = 0; i < 3; i++){
                if(i == 2){
                    return -1;
                }
                else if(spots[i].parkedCar == null){
                    spots[i].parkedCar = parkingCar;
                    return i;
                }
            }
        }
        else{
            for(int i = 2; i<11;i++){
                if(i==10){
                    return -1;
                }
                else if(spots[i].parkedCar == null){
                    spots[i].parkedCar = parkingCar;
                    return i;
                }
            }
        }
        return 0;
    }

    public void RemoveCar(int space){
        spots[space].parkedCar = null;
    }

}

