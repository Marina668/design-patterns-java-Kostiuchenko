public class StateLow implements State {
    @Override
    public void turnUp(Fan fan) {
        fan.setState(new StateMedium());
        System.out.println("Fan is on medium");
    }

    @Override
    public void turnDown(Fan fan) {
        System.out.println("State: Low. Lower not possible");
    }
}
