interface interface {
    void changeCadence(int newValue);
    void changeGear(int newValue);
    void speedUp(int increment);
    void applyBrakes(int decrement);
}

class ACMEBicycle implements interface {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue){
        cadence = newValue;
    }
    void changeGear(int newValue){
        gear = newValue;
    }
    void speedUp(int increment){
        speed = speed + increment;
    }
    void applyBrakes(int decrement){
        speed = speed - decrement;
    }
    void printStates(){
        System.out.println("cadence:" +
            cadence + " speed:" +
            speed + " gear:" + gear);
    }
}