public class Medic extends Heroes{

    private int healPoints;

    public Medic(int health, int damage, String typeOfAbility, int healthPoints) {
        super(health, damage, typeOfAbility);
        this.healPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healPoints = healthPoints;
    }

    public String increaseExperience (){
        double tenPercent = (((10 * healPoints) / 100) + healPoints);
        return "Heal Points: " + healPoints + " get bigger and became: " + tenPercent;

    }
    public String info(){
        return getHealth() + " " + getDamage() + " " + getTypeOfAbility() + " " + getHealthPoints();
    }



    @Override
    public void applySuperAbility() {
        System.out.println("Medic used healing allies");
    }
}
