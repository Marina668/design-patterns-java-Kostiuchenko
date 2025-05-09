public class Plane {

  private boolean isInTheAir;
  private final int id;
  private final Mediator mediator;

  public Plane(int id, Mediator mediator) {
    this.id = id;
    this.mediator = mediator;
    this.isInTheAir = false;
    mediator.registerPlane(this);
  }

  public void takeOff() {
    mediator.requestTakeOff(this);
  }

  public void land() {
    mediator.requestLand(this);
  }

  public boolean getIsInTheAir() {
    return isInTheAir;
  }

  public void setIsInTheAir(boolean isInTheAir) {
    this.isInTheAir = isInTheAir;
  }

  public int getId() {
    return id;
  }
}
