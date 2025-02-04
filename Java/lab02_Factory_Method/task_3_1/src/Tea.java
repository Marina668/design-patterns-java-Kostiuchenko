public class Tea extends Drink{
    double teaLeavesPrice = 21.11;

    public Tea(int volume) {
        super(volume);
        this.ingredientsPrice.add(teaLeavesPrice);
        setDrinkPrice();
        this.drinkName = "Tea";

    }
}
