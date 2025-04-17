import java.util.Random;

public class ImageGallery {
    interface ImageFactory {
        DisplayObject createDisplayObject(String imagePath);
    }
    static class RealImageFactory implements ImageFactory {
        @Override
        public DisplayObject createDisplayObject(String imagePath) {
            return new ImageFile(imagePath);
        }
    }
    static class ProxyImageFactory implements ImageFactory {
        @Override
        public DisplayObject createDisplayObject(String imagePath) {
            return new ProxyImageFile(imagePath);
        }
    }

    public static void main(String[] args) {
//        ImageFactory factory = new RealImageFactory();
        ImageFactory factory = new ProxyImageFactory();

        String path = "resources/";
        DisplayObject[] images = {
                // якщо виникає помилка завантаження, замініть відносний шлях на абсотютний шлях!
                factory.createDisplayObject(path + "image1.jpeg"),
                factory.createDisplayObject(path + "image2.jpeg"),
                factory.createDisplayObject(path + "image3.jpeg"),
                factory.createDisplayObject(path + "image4.jpeg"),
                factory.createDisplayObject(path + "image5.jpeg"),
                factory.createDisplayObject(path + "image6.jpeg"),
                factory.createDisplayObject(path + "image7.jpeg"),
                factory.createDisplayObject(path + "image8.jpeg"),
                factory.createDisplayObject(path + "image9.jpeg"),
                factory.createDisplayObject(path + "image10.jpeg"),
        };
        Random random = new Random();
        int iter_number = 10;
        for (int i = 0; i<iter_number;i++) {
            int image_number = random.nextInt(images.length);
            DisplayObject image = images[image_number];
            image.display();
        }

    }

}