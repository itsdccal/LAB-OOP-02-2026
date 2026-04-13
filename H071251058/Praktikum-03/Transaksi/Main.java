public record Main() {
    public static void main(String[] args) {
        MemberCard member1 = new MemberCard("fayyadh", "silver", 100, "H071251078");
        
        member1.beli(200000);
        member1.reedem();
    }
}
