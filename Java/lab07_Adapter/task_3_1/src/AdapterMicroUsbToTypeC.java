import com.mobile.Legacy.MicroUsbCharger;

public class AdapterMicroUsbToTypeC implements TypeCCharger {

    final MicroUsbCharger microUsbCharger;

    public AdapterMicroUsbToTypeC(MicroUsbCharger microUsbCharger) {
        this.microUsbCharger = microUsbCharger;
    }

    @Override
    public float getOutputPower() {
        return microUsbCharger.getOutputVoltage() *
                microUsbCharger.getOutputAmperage();
    }
}
