class Produk {
    String brand;
    String serialNumber;
    double price;

    Produk(String brand, String serialNumber, double price) {
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    void tampilkanInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Price: $" + price);
    }
}

class Smartphone extends Produk {
    double screenSize;
    int storage;

    Smartphone(String brand, String serial, double price, double screenSize, int storage) {
        super(brand, serial, price);
        this.screenSize = screenSize;
        this.storage = storage;
    }

    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Storage Capacity: " + storage + "GB");
        System.out.println();
    }
}

class Laptop extends Produk {
    String processor;
    int ram;

    Laptop(String brand, String serial, double price, String processor, int ram) {
        super(brand, serial, price);
        this.processor = processor;
        this.ram = ram;
    }

    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Processor Type: " + processor);
        System.out.println("RAM Size: " + ram + "GB");
        System.out.println();
    }
}

class Camera extends Produk {
    int resolution;
    String lens;

    Camera(String brand, String serial, double price, int resolution, String lens) {
        super(brand, serial, price);
        this.resolution = resolution;
        this.lens = lens;
    }

    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Resolution: " + resolution + "MP");
        System.out.println("Lens Type: " + lens);
        System.out.println();
    }
}