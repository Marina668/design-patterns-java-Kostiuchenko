public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Car sedan = director.createSedan();
        Car suv = director.createSUV();

        System.out.println(sedan);
        System.out.println(suv);
    }
}
