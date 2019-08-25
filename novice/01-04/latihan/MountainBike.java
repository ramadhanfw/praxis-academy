package class;

class Bicycle {
    int cadence;
    int speed;
    int gear;

    public Bicycle(int startCadence, int startSpeed, int startGear){
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    public void setCadence(int newValue){
        cadence = newValue;
    }

    public int getCadence(){
        return cadence;
    }
    public void setGear(int newValue){
        gear = newValue;
    }
    public int getGear(){
        return gear;
    }
    public void applyBrake(int decrement){
        speed -= decrement;
    }
    public void speedUp(int increment){
        speed += increment;
    }
}

public class MountainBike extends Bicycle {
    public int seatHeight;
    public MountainBike(int startHeight, int startCadende, int startSpeed, int startGear){
      
        super(startCadende, startSpeed, startGear);
        seatHeight = startHeight;
        }
        public void setHeight(int newValue) {
            seatHeight = newValue;
        }
        public int getHeight() {
            return seatHeight;
        }
        
    public static void main(String[] args){
        MountainBike mBicycle = new MountainBike(10,20,12,12);
        System.out.println("Cadence : "+ mBicycle.cadence);
        System.out.println("Height : "+ mBicycle.seatHeight);
        System.out.println("Speed : "+ mBicycle.speed);
        System.out.println("Gear : "+ mBicycle.gear);
    }     
}