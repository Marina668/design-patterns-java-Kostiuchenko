public abstract class Character {

    /**
     * Підняти зброю для захисту
     */
    abstract public void pickUpWeapon();

    /**
     * Захист
     */
    abstract public void defenseAction();

    /**
     * Повернення героя в безпечне місце
     */
    abstract public void moveToSafety();

    /**
     * Стратегія захисту та відступу
     */
    final public void defendAgainstAttack() {
        pickUpWeapon();
        defenseAction();
        moveToSafety();
        System.out.println();
    }
}
