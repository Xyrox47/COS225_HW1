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
                    System.out.println(spots[i].parkedCar);
                    handicapOpen++;
                }
            }
            else if (i <= 10){
                if (spots[i].parkedCar == null){
                    otherOpen++;
                    System.out.println(spots[i].parkedCar);
                    // Ask question
                }
            }
            }
            String str2 = Integer.toString(otherOpen);
            String str1 = Integer.toString(handicapOpen);

    
            return str1+" "+ str2;
        }


    
    public int ParkCar(Car parkingCar){
        if (parkingCar.handicap = true){
            if (spots[0].parkedCar == null){
                spots[0].parkedCar = parkingCar;
                return 0;
            }
        }
        else{
            spots[2].parkedCar = parkingCar;
            return 2;
        }
        return 0;
    }
    public void RemoveCar(int space){
        spots[space].parkedCar = null;
    }



    }

