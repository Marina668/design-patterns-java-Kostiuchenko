public class Water implements Topping {

    int volume;

    public Water(int volume) {
        this.volume = volume;
    }
    @Override
    public double getToppingPrice() {
        return volume / 10.0;
    }

    @Override
    public int getToppingVolume() {
        return volume;
    }

    @Override
    public String getToppingName() {
        return "water";
    }
}
