public abstract class Heroes implements HavingSuperAbility {
    private int health;
    private int damage;
    private String typeOfAbility;

    public Heroes(int health, int damage, String typeOfAbility) {
        this.health = health;
        this.damage = damage;
        this.typeOfAbility = typeOfAbility;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeOfAbility() {
        return typeOfAbility;
    }

    public void setTypeOfAbility(String typeOfAbility) {
        this.typeOfAbility = typeOfAbility;
    }


public String info(){
    return getHealth() + " " + getDamage() + " " + getTypeOfAbility();
}
}
