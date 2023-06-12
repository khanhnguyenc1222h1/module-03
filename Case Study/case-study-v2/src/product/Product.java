package product;

public class Product {
    private String brand;
    private String color;
    private int size;
    private int quatity;
    private int price;
    private int id;
    private static int count = 0;
    public Product(){
    }

    public Product(String brand, String color, int size,int price, int quatity) {
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
        this.quatity = quatity;
        this.id = ++count;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity -= quatity;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return  "brand= " + brand +
                ", color= " + color +
                ", size= " + size+
                ", price= "+ price +
                ", quatity= "+ quatity+
                ", id= "+ id;
    }
}
