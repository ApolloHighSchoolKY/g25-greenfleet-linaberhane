public class ElectricCar extends Vehicle {
    private double batteryPercent;

    public ElectricCar(String model) {
        //Use super() to set the model
        //Set batteryPercent to 100.0
        super(model);
        batteryPercent = 100.0;
    }

    /**
     * Override drive: Decreases battery by 1% for every 5 miles driven.
     */
    @Override
    public void drive(int distance) {
        //Call super.drive() 
        //Calculate battery loss
        
        super.drive(distance);
        if((batteryPercent -= distance/5.0)<0)
            batteryPercent = 0;
        else
            batteryPercent -= distance/5.0;
    }

    public void charge() {
        batteryPercent = 100.0;
    }

    public double getBattery(){
        return batteryPercent;
    }

    public String toString() {
        //Return model, mileage, and status
        return super.toString() + "\nBattery percent: " + batteryPercent;
    }
}
