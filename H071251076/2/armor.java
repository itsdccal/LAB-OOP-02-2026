class Armor {
    String type;
    int thickness;

    public Armor() {
        this.type = "Basic";
        this.thickness = 50;
    }

    public Armor(String type, int thickness) {
        this.type = type;
        this.thickness = thickness;
    }

    public int getProtection() {
        if (type.equalsIgnoreCase("Composite")) {
            return thickness + 30;
        } else if (type.equalsIgnoreCase("ERA")) {
            return thickness + 20;
        } else {
            return thickness;
        }
    }

    public String getArmorInfo() {
        return type + " armor (" + thickness + "mm)";
    }
}
