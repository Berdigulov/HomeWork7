public class Magic extends Heroes {


    public Magic(int health, int damage, String typeOfAbility) {
        super(health, damage, typeOfAbility);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic used FireBall");
    }
}
