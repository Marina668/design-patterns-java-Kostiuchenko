public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String string1 = stringBuilder.add("Hello")
                .add(" world")
                .addToPosition("dear ", 6)
                .add("!!!")
                .build();
        System.out.println("String 1: " + string1);

        StringBuilder stringBuilder1 = new StringBuilder();
        String string2 = stringBuilder1.add("I")
                .add(" like")
                .add(" dogs")
                .replace(" cats", 7, 4)
                .build();

        System.out.println("String 2: " + string2);

    }
}