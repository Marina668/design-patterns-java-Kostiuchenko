import java.io.*;
import java.util.concurrent.locks.ReentrantLock;


public class TextEditor {
    public TextEditor() {
    }

    private static TextEditor instance = null;
    private static ReentrantLock mutex = new ReentrantLock();
    public static TextEditor getInstance() {
        if (instance == null){
            mutex.lock();
            if (instance == null) {
                System.out.println("Creating new instance of TextEditor");
                instance =  new TextEditor();
            }
            mutex.unlock();
        }

        return instance;
    }

    public String readFile(String fileName) {
        String content = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            content = String.join("\n", br.lines().toList());

            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return content;
    }

    public void writeToFile(String fileName, String content) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(content);
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void appendToFile(String fileName, String content) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
            bw.write(content);
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}