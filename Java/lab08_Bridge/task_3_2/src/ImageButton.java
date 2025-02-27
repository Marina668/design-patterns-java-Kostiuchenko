public class ImageButton extends Button {
    public ImageButton(ButtonSize buttonSize) {
        super(buttonSize);
    }

    public void draw() {
        super.draw();
        System.out.println("Drawing a image button.\n");
    }
}
