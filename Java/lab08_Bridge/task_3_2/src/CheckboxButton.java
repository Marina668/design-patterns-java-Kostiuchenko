public class CheckboxButton extends Button {

  public CheckboxButton(ButtonSize buttonSize) {
    super(buttonSize);
  }

  public void draw() {
    super.draw();
    System.out.println("Drawing a checkbox button.\n");
  }

}
