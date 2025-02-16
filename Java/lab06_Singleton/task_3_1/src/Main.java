public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = TextEditor.getInstance();
        String text = textEditor.readFile("src\\textFile.txt");
        System.out.println(text);

        TextEditor textEditor2 = TextEditor.getInstance();
        textEditor2.appendToFile("src\\textFile.txt", "\nHello");
        textEditor2.appendToFile("src\\textFile.txt", " Kitty!");
        System.out.println("--------------------------");
        String text2 = textEditor2.readFile("src\\textFile.txt");
        System.out.println(text2);
    }
}