package week5;

public class Clothing {

    private String description;
    private double price;
    private char size;

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public Clothing(String description, double price, char size) {
        this.description = description;
        this.price = price;
        this.size = size;
        
        
    }

    public double getPrice() {
        return price;
    }
}
