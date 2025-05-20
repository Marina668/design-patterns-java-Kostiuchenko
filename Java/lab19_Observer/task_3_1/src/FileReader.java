import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    private final String filePath;

    public FileReader(String filePath) {
        this.filePath = filePath;

        Thread thread = new Thread(this::read);
        thread.start();
    }

    public void read() {
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath))) {
            reader.lines().forEach(this::onLineRead);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            onLineRead("END.");
        }
    }

    void onLineRead(String line) {
        System.out.println(line);
        if (line.equals("END.")) {
            System.out.println("========Summary========");
        }
        notifySubscribers(line);
    }

    private final List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String line) {
        for (Subscriber subscriber : subscribers) {
            subscriber.printInfo(line);
        }
    }
}
