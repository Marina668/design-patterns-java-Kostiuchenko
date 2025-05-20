public class WordsCounter implements Subscriber {
    private int wordsNumber = 0;

    @Override
    public void printInfo(String line) {
        if (line.equals("END.")) {
            System.out.println("Words count = " + wordsNumber);
        } else {
            String[] words = line.split("\\s+");
            wordsNumber += words.length;
        }
    }
}
