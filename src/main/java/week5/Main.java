package week5;

import javax.xml.namespace.QName;
import java.sql.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Clothing suit = new Clothing("Black jacket and slacks", 400.0, 'M');
        Clothing coat = new Clothing("Fur coat", 100, 'L');
        Clothing jeans = new Clothing("Amiri", 500, 'S');

        Clothing [] managerCart = {suit, coat, jeans};
        Clothing [] employeeCart = {suit, coat, jeans};


        Manager theManager = new Manager("Phillip", managerCart, 'L');
        HourlyEmployee hEmployee = new HourlyEmployee("O'Brian", employeeCart, 'S');




        ArrayList<Clothing> clothingItems = new ArrayList<>();
        clothingItems.add(suit);
        clothingItems.add(coat);
        clothingItems.add(jeans);

//        for( int i=0; i<clothingItems.size(); i++){
//            System.out.println(clothingItems.get(i));
//        }


        System.out.println("Now printing items in Array List:");
        for(Clothing x : clothingItems){
            System.out.println(x);

        }

        System.out.println("Total price of manager's cart:");
        System.out.println(ShopApp.calcTotal(managerCart));
        System.out.println("Checking to see if manager can fit coat: ");
        System.out.println(ShopApp.isAFit(theManager, coat));
        System.out.println("Checking to see if hourly employee can fit suit: ");
        System.out.println(ShopApp.isAFit(hEmployee, suit));


        System.out.println("Manager's discount prices on suit and coat:");
        theManager.printEmpPriceAfterDisc(suit);
        theManager.printEmpPriceAfterDisc(coat);
        System.out.println("Hourly employee's discount prices on suit and coat:");
        hEmployee.printEmpPriceAfterDisc(suit);
        hEmployee.printEmpPriceAfterDisc(coat);

        System.out.println("List of employees by name:");
        ShopApp.printEmployeeName(theManager);
        ShopApp.printEmployeeName(hEmployee);

        System.out.println("Print discount amounts for a suit for each employee type now:");
        Discountable[] discountables = {hEmployee, theManager};
        ShopApp.printDiscAmtOff(discountables, suit);

        System.out.println("Sorting clothing items by price from lowest price to highest price:");
        ShopApp.sortAndPrintClothingByPrice(clothingItems);



    }

}
