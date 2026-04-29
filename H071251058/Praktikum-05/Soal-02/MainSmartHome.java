public class MainSmartHome {
    public static void main(String[] args) {
        SmartLamp lampu = new SmartLamp("Philips", 10);
        SmartCCTV cctv = new SmartCCTV("Imou", 15);
        SmartSpeaker speaker = new SmartSpeaker("Google Home", 25);

        System.out.println("=== PENGUJIAN LAMPU ===");
        lampu.infoPower();
        lampu.prosesPerintah("nyala");

        System.out.println("\n=== PENGUJIAN CCTV ===");
        cctv.infoPower();
        cctv.hubungkanWiFi();

        System.out.println("\n=== PENGUJIAN SPEAKER ===");
        speaker.infoPower();

        speaker.hubungkanWiFi();
        speaker.prosesPerintah("Putar lagu jazz");
    }
}