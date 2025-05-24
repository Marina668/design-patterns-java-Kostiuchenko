public class Saboteur implements Spy {
    @Override
    public void visit(MilitaryBase militaryBase) {
        militaryBase.setJeeps(0);
        System.out.println("Saboteur get jeeps and destroyed it, now there are " + militaryBase.getJeeps());
        militaryBase.setTanks(0);
        System.out.println("Saboteur get tanks and destroyed it, now there are " + militaryBase.getTanks());
        militaryBase.setOfficers(0);
        System.out.println("Saboteur killed officers, now there are " + militaryBase.getOfficers());
        militaryBase.setSoldiers(0);
        System.out.println("Saboteur killed soldiers, now there are " + militaryBase.getSoldiers());
    }

    @Override
    public void visit(GeneralStaff generalStaff) {
        generalStaff.setSecretPaper(0);
        System.out.println("Saboteur get secret paper and destroyed it, now it is " + generalStaff.getSecretPaper());
        generalStaff.setGenerals(0);
        System.out.println("Saboteur killed generals, now there are " + generalStaff.getGenerals());
    }
}
