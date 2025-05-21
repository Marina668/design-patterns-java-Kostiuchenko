public class StateHigh implements State {
    @Override
    public void turnUp(Fan fan) {
        System.out.println("State: High. Higher not possible");
    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(new StateMedium());
        System.out.println("Fan is on medium");
    }
}
