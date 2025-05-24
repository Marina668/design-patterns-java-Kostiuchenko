public class SecretAgent implements Spy {
    @Override
    public void visit(MilitaryBase militaryBase) {
        System.out.println("Military base do not have secret paper so Secret Agent do nothing");
    }

    @Override
    public void visit(GeneralStaff generalStaff) {
        int secretPaper = generalStaff.getSecretPaper();
        System.out.println("Secret Agent get secret paper " + secretPaper);
    }
}
