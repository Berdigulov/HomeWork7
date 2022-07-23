public class Medic extends Heroes{

    private int healthPoints;

    public Medic(int health, int damage, String typeOfAbility, int healthPoints) {
        super(health, damage, typeOfAbility);
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void increaseExperience (){
        if (this.healthPoints >= 30){
            this.healthPoints = this.healthPoints + 3;
        }

    }
    public void info(){
        System.out.println(getHealth() + " " + getDamage() + " " + getTypeOfAbility() + " " + getHealthPoints());
    }



    @Override
    public void applySuperAbility() {
        System.out.println("Medic used healing allies");
    }
}
