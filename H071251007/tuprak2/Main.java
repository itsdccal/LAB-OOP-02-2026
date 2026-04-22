package tuprak2;

public class Main {
    public static void main(String[] args) {
        Spell fire = new Spell("Fireball", 30, 15);
        Spell ice = new Spell("Absolute freeze", 50, 20);

        mage mage1 = new mage("Yvolka", 50, 20, fire);
        mage mage2 = new mage("Cayena", 50, 20, ice);

        mage1.showStatus();
        mage2.showStatus();

        mage1.attack(mage2);

        mage1.showStatus();
        mage2.showStatus();

        mage2.attack(mage1);

        mage1.showStatus();
        mage2.showStatus();
    }
}
