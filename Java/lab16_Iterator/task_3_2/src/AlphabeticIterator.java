import java.util.*;

public class AlphabeticIterator implements Iterator<ShopItem> {

    private final List<ShopItem> items;
    private int iterationState;
    public AlphabeticIterator(Shop shop) {
        this.items = new ArrayList<>(shop.getItems().values());
        this.items.sort(Comparator.comparing(ShopItem::getName,String.CASE_INSENSITIVE_ORDER));
        iterationState = 0;


    }

    @Override
    public boolean hasNext() {
        return iterationState < items.size();
    }

    @Override
    public ShopItem next() {
        return items.get(iterationState++);
    }
}
