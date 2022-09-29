package week5;

public class HourlyEmployee extends Employee implements Discountable{


    public HourlyEmployee(String name, Clothing[] clothingItems, char size) {
        super(name, clothingItems, size);
    }


    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        System.out.println(clothing.getPrice()-calcDiscount(clothing));

    }

    @Override
    public double calcDiscount(Clothing clothing) {
        return clothing.getPrice()*getDISCOUNT();
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "discount=" + getDISCOUNT() +
                '}';
    }
}
