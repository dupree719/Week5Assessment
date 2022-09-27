package week5;

public class HourlyEmployee extends Employee implements Discountable{
    private final double discount = 0.10;

    public HourlyEmployee(String name, Clothing[] clothingItems, char size) {
        super(name, clothingItems, size);
    }



    public HourlyEmployee(String name) {
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
        return "HourlyEmployee{" +
                "discount=" + discount +
                '}';
    }
}
