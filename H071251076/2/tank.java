class Tank {
    String name;
    int health;
    Armor armor = new Armor();
    Ammo ammo = new Ammo();

    //constructor default
    public Tank() {
        this.name = "Tonk";
        this.health = 100;
    }

    //param const.
    public Tank(String name, int health, String armorType, int armorThickness, String ammoType, int penetration, int damage) {
        this.name = name;
        this.health = health;
        this.armor.type = armorType;
        this.armor.thickness = armorThickness;
        this.ammo.ammoType = ammoType;
        this.ammo.penetration = penetration;
        this.ammo.damage = damage;
    }
    //engage method,main battle funct.
    public void engage(Tank enemy) {
        System.out.println(this.name + " engages with " + enemy.name + "!");
        System.out.println("-------------------------------------------");

        //pen calc
        int myPenetration = this.ammo.penetration;
        int enemyArmor = enemy.armor.getProtection();

        System.out.println(this.name + " fires " + this.ammo.ammoType + " (" + myPenetration + "mm pen)");
        System.out.println(enemy.name + "'s armor: " + enemyArmor + "mm effective");

        if (myPenetration > enemyArmor) {
            int damageDealt = this.ammo.damage;
            enemy.health -= damageDealt;
            System.out.println("Hit! " + enemy.name + " takes " + damageDealt + " damage!");
        } else {
            int damageDealt = this.ammo.damage / 2;
            enemy.health -= damageDealt;
            System.out.println("Non-penetration! Only " + damageDealt + " damage dealt.");
        }

        System.out.println(enemy.name + "'s health: " + enemy.health + " HP");

        if (enemy.health <= 0) {
            System.out.println(enemy.name + " destroyed!");
        }
        System.out.println("--------------------------------------------");
    }

    //2nd method, repair, to replenish hp
    public void repair() {
        System.out.println(this.name + " is repairing...");
        
        int healthGain = 30;
        int armorRepair = 10;

        this.health += healthGain;
        this.armor.thickness += armorRepair;

        System.out.println("Health restored by " + healthGain + " HP (New HP: " + this.health + ")");
        System.out.println("Armor reinforced by " + armorRepair + "mm (New: " + this.armor.thickness + "mm)");
        System.out.println("Repair complete!");
    }

    //check status for each tanks
    public void checkStatus() {
        System.out.println(name + " Status");
        System.out.println("Tank\t\t: " + name);
        System.out.println("Health\t\t: " + health + " HP");
        System.out.println("Armor\t\t: " + armor.getArmorInfo());
        System.out.println("Protection\t: " + armor.getProtection() + "mm effective");
        System.out.println("Ammo\t\t: " + ammo.getAmmoInfo());
        System.out.println("-----------------------------\n");
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
