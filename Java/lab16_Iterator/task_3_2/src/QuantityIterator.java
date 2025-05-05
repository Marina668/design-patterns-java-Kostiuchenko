import java.util.*;

public class QuantityIterator implements Iterator<ShopItem> {

    private final List<ShopItem> items;
    private int iterationState;

    public QuantityIterator(Shop shop) {
        this.items = new ArrayList<>(shop.getItems().values());
        this.items.sort(Comparator.comparing(ShopItem::getQuantity).reversed());
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