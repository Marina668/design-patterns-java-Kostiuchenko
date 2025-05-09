public class Operator implements Mediator {
    private final Runway runway = new Runway();

    private final PlanesInFlight planesInFlight = new PlanesInFlight();
    private final PlanesOnGround planesOnGround = new PlanesOnGround();

    @Override
    public void registerPlane(Plane plane) {
        planesOnGround.addPlane(plane);
    }

    @Override
    public void requestTakeOff(Plane plane) {
        if (!plane.getIsInTheAir() && runway.getIsAvailable()) {
            System.out.println("Plane " + plane.getId() + " is taking off...");

            planesOnGround.removePlane(plane);
            planesInFlight.addPlane(plane);
            plane.setIsInTheAir(true);

            runway.setIsAvailable(false);
        } else {
            System.out.println("Plane " + plane.getId() + " cannot take off at this time.");
        }
    }

    @Override
    public void requestLand(Plane plane) {
        if (plane.getIsInTheAir() && runway.getIsAvailable()) {
            System.out.println("Plane " + plane.getId() + " is landing...");
            planesInFlight.removePlane(plane);
            planesOnGround.addPlane(plane);
            plane.setIsInTheAir(false);
            runway.setIsAvailable(false);
        }
        else {
            System.out.println("Plane " + plane.getId() + " cannot land at this time.");
        }
    }

}
