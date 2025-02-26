import com.mobile.Legacy.MicroUsbCharger;

public class AdapterTypeCToMicroUsb implements MicroUsbCharger {

    final TypeCCharger typeCCharger;

    public AdapterTypeCToMicroUsb(TypeCCharger typeCCharger) {
        this.typeCCharger = typeCCharger;
    }

    @Override
    public float getOutputVoltage() {
        return 0.5f;
    }

    @Override
    public float getOutputAmperage() {
        return typeCCharger.getOutputPower() / getOutputVoltage();
    }
}
