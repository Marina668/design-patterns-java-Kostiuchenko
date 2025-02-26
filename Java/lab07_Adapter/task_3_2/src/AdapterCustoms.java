import com.vehiclecalculator.*;

import java.util.Objects;

public class AdapterCustoms implements Customs {

    float taxRate = 0.2f;
    float UsdToUahRate = 41.59f;

    public AdapterCustoms(float taxRate, float UsdToUahRate) {
        this.taxRate = taxRate;
        this.UsdToUahRate = UsdToUahRate;
    }

    public AdapterCustoms() {
    }

    @Override
    public float vehiclePrice(Auto auto) {
        VehicleCalculator vehicleCalculator;
        Vehicle vehicle;

        if (Objects.equals(auto.model, "truck")) {
            vehicleCalculator = new TruckCalculator();
            vehicle = new Truck(auto.age, auto.mileage);
        } else {
            vehicleCalculator = new CarCalculator();
            vehicle = new Vehicle(auto.age, auto.model, (auto.damaged ? 1f : 0f), auto.mileage);
        }

        vehicleCalculator.setVehicle(vehicle);
        float vehiclePrice = Float.parseFloat(
                vehicleCalculator.calculatePrice().
                        replace("USD", ""));

        vehiclePrice = vehiclePrice * UsdToUahRate;

        return vehiclePrice;
    }

    @Override
    public float tax(Auto auto) {
        return vehiclePrice(auto) * taxRate;
    }
}
