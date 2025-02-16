public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Car sedan = director.createSedan();
        System.out.println(sedan);
        System.out.println("------------------------------------------");

        Car suv = director.createSUV();
        System.out.println(suv);
        System.out.println("------------------------------------------");

        Car sedan2 = sedan.copy();
        System.out.println(sedan2);
        System.out.println("------------------------------------------");

        Car suv2 = suv.copy();
        System.out.println(suv2);
    }
}
