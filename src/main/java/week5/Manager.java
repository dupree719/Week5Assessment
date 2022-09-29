package week5;

public class Manager extends Employee implements Discountable{
    private final double DISCOUNT = 0.25;

    public Manager(String name, Clothing[] clothingItems, char size) {
        super(name, clothingItems, size);

    }


    public double getDISCOUNT() {
        return DISCOUNT;
    }


    @Override
    public double calcDiscount(Clothing clothing) {
        return clothing.getPrice()*DISCOUNT;

    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        System.out.println(clothing.getPrice()-calcDiscount(clothing));

    }


    @Override
    public String toString() {
        return "Manager{" +
                "discount=" + DISCOUNT +
                '}';
    }
}
