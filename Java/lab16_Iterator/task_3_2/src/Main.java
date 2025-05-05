public class Main {

  public static void main(String[] args) {

    ShopItem pens = new ShopItem("pen", 175);
    ShopItem pencils = new ShopItem("pencil", 0);
    ShopItem paper = new ShopItem("paper", 500);

    Shop shop = new Shop();
    shop.putItem(pens);
    shop.putItem(pencils);
    shop.putItem(paper);

    System.out.println("=====Iteration in alphabetic order=====");
    shop.setIteratorFactory(AlphabeticIterator::new);
    for (ShopItem item : shop){
      System.out.println(item);
    }

    System.out.println("\n=====Iteration by quantity in descending order=====");
    shop.setIteratorFactory(QuantityIterator::new);
    for (ShopItem item : shop){
      System.out.println(item);
    }

  }

}
