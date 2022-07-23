public class Warrior extends Heroes{


    public Warrior(int health, int damage, String typeOfAbility) {
        super(health, damage, typeOfAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior used Rampage");
    }
}
