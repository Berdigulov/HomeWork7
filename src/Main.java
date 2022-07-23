public class Main {

    public static void main(String[] args) {
        Warrior warrior = new Warrior(200,40,"Critical damage");
        Magic magic = new Magic(190, 45, "Fire Ball");
        Medic medic = new Medic(170, 20, "Healing allies",30);
        Heroes heroes [] = new Heroes[]{warrior, medic, magic};
        for (int i = 0; i < heroes.length; i++) {

            medic.increaseExperience();
            break;

        }
        medic.info();
        warrior.info();
        magic.info();


    }
}