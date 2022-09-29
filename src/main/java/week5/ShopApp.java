package week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ShopApp {


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
        public static void sortAndPrintClothingByPrice(ArrayList<Clothing> clothingArrayList){
            Collections.sort(clothingArrayList, Comparator.comparingDouble(Clothing :: getPrice));
            clothingArrayList.forEach(clothing -> System.out.println(clothing));

        }


        public static void printEmployeeName (Employee employee){
            System.out.println(employee.getName());


        }
        public static void printDiscAmtOff (Discountable[]discountables, Clothing clothing){
                for(int i =0; i < discountables.length; i++){
                    System.out.println(discountables[i].calcDiscount(clothing));

                }


        }

}

