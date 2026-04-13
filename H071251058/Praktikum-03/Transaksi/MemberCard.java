public class MemberCard {
    public String username;
    String tierLevel;
    private int totalPoint;
    private String secretReferalCode;

    public MemberCard(String username,String tierLevel, int totalPoint, String secretReferalCode){
        this.tierLevel = "silver";
        this.totalPoint = totalPoint;
        this.secretReferalCode = secretReferalCode;
    }

    public String getTier(){
        return tierLevel;
    }

    public int getTotalPoint(){
        return totalPoint;
    }

    public void beli(int harga){
        if (harga > 100000){
            this.totalPoint += 50;
        } else {
            this.totalPoint += 5;
        }
        autoUpgradeTier();
    }

    public void reedem(){
        if (this.tierLevel == "gold" || this.tierLevel == "platinum"){
            this.totalPoint -= 50;
            System.out.println("reedem berhasil " + totalPoint);
        }
    }

    public void autoUpgradeTier(){
        if (this.totalPoint > 100){
            this.tierLevel = "gold";
        } else if (this.totalPoint > 200){
            this.tierLevel = "platinum";
        }
    }

}