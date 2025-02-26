import com.vehiclecalculator.CarCalculator;
import com.vehiclecalculator.Vehicle;
import com.vehiclecalculator.VehicleCalculator;

public class Main {

    public static void main(String[] args) {

//        Vehicle vehicle = new Vehicle(5, "Audi", 0.2f, 100_000);
//        VehicleCalculator calculator = new CarCalculator();
//        calculator.setVehicle(vehicle);
//        System.out.println(calculator.calculatePrice());

        System.out.println("---------------------");
        Auto auto = new Auto(5, "Audi", true, 100_000);
        Customs adapterCustoms = new AdapterCustoms();

        float autoPrice = adapterCustoms.vehiclePrice(auto);
        float autoTax = adapterCustoms.tax(auto);

        System.out.println("Auto price: " + autoPrice + " UAH");
        System.out.println("Auto tax: " + autoTax + " UAH");
        System.out.println("Auto overall price: " + (autoPrice + autoTax) + " UAH");


        System.out.println("---------------------");
        Auto truck = new Auto(10, "truck", false, 200_000);

        float truckPrice = adapterCustoms.vehiclePrice(truck);
        float truckTax = adapterCustoms.tax(truck);

        System.out.println("Truck price: " + truckPrice + " UAH");
        System.out.println("Truck tax: " + truckTax + " UAH");
        System.out.println("Truck overall price: " + (truckPrice + truckTax) + " UAH");
    }


}
