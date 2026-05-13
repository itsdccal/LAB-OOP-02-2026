package tuprak3;

public class PlayerProfile {
    private int level;
    private String password;
    protected String username;
    int healtPoint;

    public PlayerProfile(String username, String password){
        this.level = 1;
        this.password = password;
        this.username = username;
        this.healtPoint = 100;
    }

    public String getUsername(){
        return username;
    }

    public int getLevel(){
        return level;
    }

    public void setPassword(String pass_baru){
        if (pass_baru.length() != 8){
            System.out.println(("ERROR! Pin harus 8 karakter!"));   
        } else {
            this.password = pass_baru;
            System.out.println("Perubahan Berhasil!");
        }
    }

    public void levelUp(){
        this.level++;
        System.out.println("Sistem: Progres otomatis tersimpan ke server");
        saveData();
    }

    public void recieveDamage (int damage){
        healtPoint -= damage;
        if (healtPoint <= 0){
            System.out.println("Player mati");
        }
    }

    private void saveData(){
        System.out.println("Data tersimpan :)");
    }
}
