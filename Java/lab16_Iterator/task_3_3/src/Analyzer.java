import java.util.Iterator;

public class Analyzer {

    public static Item findMin(Iterator<Component> iterator) {
        Item min = null;
        while (iterator.hasNext()) {
            Component c = iterator.next();
            if (c instanceof Item item) {
                if (min == null || item.getValue() < min.getValue()) {
                    min = item;
                }
            }
        }
        return min;
    }

    public static Item findMax(Iterator<Component> iterator) {
        Item max = null;
        while (iterator.hasNext()) {
            Component c = iterator.next();
            if (c instanceof Item item) {
                if (max == null || item.getValue() > max.getValue()) {
                    max = item;
                }
            }
        }
        return max;
    }
}
