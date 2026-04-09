class Ammo {
    String ammoType;
    int penetration;
    int damage;

    public Ammo() {
        this.ammoType = "AP";
        this.penetration = 100;
        this.damage = 50;
    }

    public Ammo(String ammoType, int penetration, int damage) {
        this.ammoType = ammoType;
        this.penetration = penetration;
        this.damage = damage;
    }

    public int calculateDamage(int armorValue) {
        if (penetration > armorValue) {
            return damage;
        } else {
            return damage / 2; // Reduced damage if can't fully penetrate
        }
    }

    public String getAmmoInfo() {
        return ammoType + " (Pen: " + penetration + "mm, Dmg: " + damage + ")";
    }
}
