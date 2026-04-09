public class Main {
    public static void main(String[] args) {
        // 
        Tank leopard = new Tank(
            "Leopard 2A7",       // name
            150,                 // health
            "Composite",         // armor type
            100,                 // armor thickness
            "DM53",              // ammo type
            180,                 // penetration
            80                   // damage
        );

        Tank abrams = new Tank(
            "M1A2 SEPv2",        // name
            145,                 // health
            "Composite",         // armor type
            95,                  // armor thickness
            "M829A3",            // ammo type
            175,                 // penetration
            75                   // damage
        );

        Tank t80 = new Tank(
            "T-80BVM",           // name
            140,                 // health
            "ERA",               // armor type
            179,                  // armor thickness
            "3BM60",             // ammo type
            170,                 // penetration
            70                   // damage
        );

        // Display initial status
        System.out.println(" INITIAL STATUS ");
        leopard.checkStatus();
        abrams.checkStatus();
        t80.checkStatus();
        pembatas();

        // Battle 1: Leopard vs Abrams
        System.out.println(" BATTLE 1 ");
        leopard.engage(abrams);
        abrams.checkStatus();
        pembatas();

        // Battle 2: T-80 vs Leopard
        System.out.println(" BATTLE 2 ");
        t80.engage(leopard);
        leopard.checkStatus();
        pembatas();

        // Repair leopard
        System.out.println(" REPAIR ");
        leopard.repair();
        leopard.checkStatus();
        pembatas();

        // Battle 3: Abrams vs T-80
        System.out.println(" BATTLE 3 ");
        abrams.engage(t80);
        t80.checkStatus();
        pembatas();

        // Final engagement
        System.out.println(" FINAL BATTLE ");
        leopard.engage(t80);
        t80.checkStatus();
        pembatas();

        // Test default constructor
        Tank defaultTank = new Tank();
        defaultTank.checkStatus();
    }

    public static void pembatas() {
        System.out.println("\n==================================\n");
    }
}
