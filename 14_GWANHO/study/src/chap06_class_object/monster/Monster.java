package chap06_class_object;

public class Monster {
    private final String name;
    private int hp;

    public Monster(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void Hit(int damage) {
        if (damage < 0) {
            return;
        }

        hp -= damage;
        if(hp <= 0) {
            System.out.println(name + " 죽음");
        }
    }
}
