package week5;

public class Manager extends Employee implements Discountable{
    private final double discount = 0.25;

    public Manager(String name, Clothing[] clothingItems, char size) {
        super(name, clothingItems, size);
    }



    public Manager(String name) {
        super(name);
    }

    public double getDiscount() {
        return discount;
    }



    @Override
    void printEmpPriceAfterDisc(Clothing clothing) {

    }

    @Override
    public void calcDiscount(Clothing clothing) {


    }

    @Override
    public String toString() {
        return "Manager{" +
                "discount=" + discount +
                '}';
    }
}
