public class Main {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader("resources/input01.txt");

        LongestLine longestLine = new LongestLine();
        LongestWord longestWord = new LongestWord();
        WordsCounter wordsCounter = new WordsCounter();
        RowWithLongestWord rowWithLongestWord = new RowWithLongestWord();

        fileReader.subscribe(longestLine);
        fileReader.subscribe(longestWord);
        fileReader.subscribe(wordsCounter);
        fileReader.subscribe(rowWithLongestWord);

        fileReader.read();
    }

}
