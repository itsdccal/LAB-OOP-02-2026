public abstract class Product {
    protected String brand;
    protected int seriesNumber;
    protected double price;

    public Product(String brand, int seriesNumber, double price) {
        this.brand        = brand;
        this.seriesNumber = seriesNumber;
        this.price        = price;
    }

    public int getSeriesNumber() {
        return seriesNumber;
    }

    public abstract void displayInfo();
}
