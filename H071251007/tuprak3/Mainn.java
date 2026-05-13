package tuprak3;

public class Mainn {
    public static void main(String[] args) {
        PlayerProfile profile = new PlayerProfile("whyu", "12345678");

        System.out.println("Username: " + profile.getUsername());
        System.out.println("Level: " + profile.getLevel());

        profile.setPassword("12345");

        profile.setPassword("12345678");

        profile.levelUp();
        System.out.println("Level: " + profile.getLevel());

        profile.recieveDamage(50);
        // System.out.println("Health Point: " + PlayerProfile.healtPoint);

        profile.recieveDamage(200);

    }
}
