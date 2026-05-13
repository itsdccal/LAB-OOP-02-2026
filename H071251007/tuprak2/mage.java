package tuprak2;

public class mage { //nama class dianjurkan huruf kapital
    String name;
    int hp;
    int mana;
    Spell spell; // atribut objek

    // note: Spell dianggap tipe data walaupun dia class

    public mage() { // constructor default
        name = "Unknown Mage";
        hp = 50;
        mana = 10;
        spell = new Spell("null", 0, 0);
    }

    public mage(String name, int hp, int mana, Spell spell) { //constructor dgn parameter
        this.name = name;
        this.hp = hp;
        this.mana = mana;
        this.spell = spell;
    }

    public void attack(mage enemy) { // behavior/method 1
        if (this.hp <= 0) {
            System.out.println(" ");
            System.out.println(name + " has returned to the embrace of the goddess");
            System.out.println(" ");
            // return;
        }

        // enemy ini mewakilkan semuanya makanya dianggap atribut objek

        if (this.mana < spell.manaCost) {
            System.out.println(" ");
            System.out.println(name + " out of mana!! failed to cast spell");
            System.out.println(" ");
            return; //return ini hanya return kosong
        }

        System.out.println(" ");
        System.out.println(name + " attacks " + enemy.name + " with a " + spell.spellName);
        System.out.println(" ");
        this.mana -= spell.manaCost;
        enemy.hp -= spell.damage;

        if (enemy.hp < 0) {
            enemy.hp = 0;
        }
        System.out.println(" ");
        System.out.println(enemy.name + " has lost " + spell.damage + " HP");
        System.out.println(" ");

        if (enemy.hp == 0) {
            System.out.println(" ");
            System.out.println(enemy.name + " has returned to the embrace of the goddess");
            System.out.println(" ");
        }
    }

    public void showStatus() { // behavior/method 2
        System.out.println("===========================================");
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
        System.out.println("Mana: " + mana);
        spell.showSpell();

        System.out.println("===========================================");
    }
}