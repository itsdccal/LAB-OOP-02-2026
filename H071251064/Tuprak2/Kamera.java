package Tuprak2;

public class Kamera {
    String merekKamera;
    Lensa lensa = new Lensa();
    double baseQuality = 50.0; 

    public String getMerekKamera() {
        return merekKamera;
    }

    public void setMerekKamera(String merekKamera) {
        this.merekKamera = merekKamera;
    }

    public double getQualityScore(String targetObjek) {
        double bonusLensa = lensa.focalLength / 10.0;
        if (targetObjek.equals("Mata")) {
            return bonusLensa + baseQuality + 25.5; 
        } else if (targetObjek.equals("Badan")) {
            return bonusLensa + baseQuality + 10.0;
        } else {
            return bonusLensa + baseQuality;
        }
    }

    public double getQualityScore() {
        return (lensa.focalLength / 10.0) + baseQuality;
    }
}