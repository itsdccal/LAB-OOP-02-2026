package tuprak2;

public class Spell {
    String spellName;
    int damage;
    int manaCost;

    public Spell(String spellName, int damage, int manaCost) {
        this.spellName = spellName;
        this.damage = damage;
        this.manaCost = manaCost;
    }

    public void showSpell() { // behavior/method 2
        System.out.println("Spell: " + spellName);
        System.out.println("Damage: " + damage);
        System.out.println("Mana Cost: " + manaCost);
    }
}