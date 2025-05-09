public interface Mediator {
    void registerPlane(Plane plane);
    void requestTakeOff(Plane plane);
    void requestLand(Plane plane);
}
