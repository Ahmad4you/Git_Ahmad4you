package factory;

/**
 * @author Ahmad Alrefai
 * 
 */
public class Dinosaur extends Enemy {

    public Dinosaur() {
        setName("Dinosaur");
        setHealth(50);
        setDamage(9);
    }

    @Override
    public void takeDamage(int value) {
        if (getHealth() > 0) {
            setHealth(getHealth() - value);
            System.out.printf("%s Took [%d] damage and health is [%d] %n", getName(), value, getHealth());
        }
    }

    @Override
    public int attack() {
        return getDamage();
    }
}
