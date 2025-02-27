public abstract class Button {

    private final ButtonSize buttonSize;

    public Button(ButtonSize buttonSize) {
        this.buttonSize = buttonSize;
    }

    public void draw() {
        System.out.println(buttonSize.getSize());
    }

}
