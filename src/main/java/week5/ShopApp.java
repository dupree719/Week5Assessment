package week5;

import java.util.ArrayList;

public class ShopApp {

    public void checkAndPrintTotalMC() {
        System.out.println();
    }

    public static double calcTotal(Clothing[] clothing) {
        double total = 0.0;
        for (int i = 0; i < clothing.length; i++) {
            total += clothing[i].getPrice();
        }
        return total;
    }

    public static boolean isAFit(Customer customer, Clothing clothing) {
        if (customer.getSize() == clothing.getSize()) {
            return true;
        }
        return false;
    }
        public static void sortAndPrintClothingByPrice(ArrayList<Clothing> clothingPrices){

        }


        public static void printEmployeeName (Employee employee){
            System.out.println(employee.getName());


        }
        public static void printDiscAmtOff (Discountable[]discount, Clothing clothing){

        }

}

