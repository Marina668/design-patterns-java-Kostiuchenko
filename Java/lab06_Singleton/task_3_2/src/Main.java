public class Main {
    public static void main(String[] args) {
        Director director = Director.getInstance();

        Car sedan = director.createSedan();
        Car suv = director.createSUV();

        System.out.println(sedan);
        System.out.println(suv);
    }
}
