package Tuprak2;

public class Perlengkapan {
    String filter;
    String tas;
    String tripod;

    public Perlengkapan(String filter, String tas, String tripod) {
        this.filter = filter;
        this.tas = tas;
        this.tripod = tripod;
    }
    
    public String getPerlengkapan() {
        return filter + ", " + tas + ", dan " + tripod;
    }

}