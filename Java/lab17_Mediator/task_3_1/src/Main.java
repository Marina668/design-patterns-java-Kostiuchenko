public class Main {

  public static void main(String[] args) {
    Mediator operator = new Operator();
    Plane plane1 = new Plane(101, operator);
    Plane plane2 = new Plane(102, operator);

    plane1.takeOff(); // Успішно
    plane2.land(); // Не вдасться, бо смуга зайнята
  }

}
