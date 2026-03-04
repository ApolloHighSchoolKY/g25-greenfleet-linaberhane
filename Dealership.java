import java.util.ArrayList;

public class Dealership {
    public static void main(String[] args) {
        ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();

        // TODO: Add a standard Vehicle and an ElectricCar
        Vehicle car = new Vehicle("Hyundai Elantra");
        Vehicle carTwo = new Vehicle("Mercedes Benz");
        Vehicle carThree = new Vehicle("Toyota Camry");
        ElectricCar eCar = new ElectricCar("Tesla");
        ElectricCar eCarTwo = new ElectricCar("Tesla Cybertruck");
        inventory.add(car);
        inventory.add(eCar);
        inventory.add(carTwo);
        inventory.add(carThree);
        inventory.add(eCarTwo);
        
        System.out.println("\n--- End of Day Report ---");
        // TODO: Loop through inventory. 
        // TODO: If a vehicle is an ElectricCar, check if it needs a charge.
        for(int i = 0; i <=5; i++)
        {
            for(Vehicle vcl: inventory)
            {
                vcl.startEngine();
                vcl.drive(75);

                System.out.println("\n" + vcl);
                if(vcl instanceof ElectricCar)
                   if(((ElectricCar)vcl).getBattery()<50)
                     ((ElectricCar)vcl).charge();
            }
        }
    }
}
