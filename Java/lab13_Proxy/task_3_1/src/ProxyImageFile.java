public class ProxyImageFile implements DisplayObject {
    private final String imagePath;
    private ImageFile imageFile;

    public ProxyImageFile(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public void display() {
        if(imageFile == null){
            imageFile = new ImageFile(imagePath);
        }
        imageFile.display();
    }
}
