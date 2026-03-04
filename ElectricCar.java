public class ElectricCar extends Vehicle {
    private double batteryPercent;

    public ElectricCar(String model) {
        // TODO: Use super() to set the model
        // TODO: Set batteryPercent to 100.0
        super(model);
        batteryPercent = 100.0;
    }

    /**
     * Override drive: Decreases battery by 1% for every 5 miles driven.
     */
    @Override
    public void drive(int distance) {
        // TODO: Call super.drive() 
        // TODO: Calculate battery loss
        int currentDistance = distance;

        super.drive(distance);
        /*
        while(distance % 5 > currentDistance)
        {
            currentDistance = distance;
            batteryPercent -= 1;
        }
        */
        batteryPercent -= distance/5;
    }

    public void charge() {
        batteryPercent = 100.0;
    }

    public double getBattery(){
        return batteryPercent;
    }

    public String toString() {
        // TODO: Return model, mileage, and status
        return super.toString() + "\nBattery percent: " + batteryPercent;
    }
}
