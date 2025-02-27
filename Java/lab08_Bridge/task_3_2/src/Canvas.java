public class Canvas {

  public static void main(String[] args) {

    CheckboxButton checkboxButton = new CheckboxButton(new ButtonSizeSmall());
    checkboxButton.draw();

    RadioButton radioButton = new RadioButton(new ButtonSizeMedium());
    radioButton.draw();

    DropdownButton dropdownButton = new DropdownButton(new ButtonSizeLarge());
    dropdownButton.draw();

    ImageButton imageButton = new ImageButton(new UserSize());
    imageButton.draw();

  }

}
