package week5;

public abstract class Employee extends Customer{
    private final double discount = 0.10;


    public Employee(String name, Clothing[] clothingItems, char size) {
        super(name, clothingItems, size);
    }



    public Employee(String name) {
        super(name);
    }


    public double getDiscount() {
        return discount;
    }

    abstract void printEmpPriceAfterDisc(Clothing clothing);



}

