public class Milk implements Topping {

    int volume;

    public Milk(int volume) {
        this.volume = volume;
    }
    @Override
    public double getToppingPrice() {
        return volume / 20.0;
    }

    @Override
    public int getToppingVolume() {
        return volume;
    }

    @Override
    public String getToppingName() {
        return "milk";
    }
}
