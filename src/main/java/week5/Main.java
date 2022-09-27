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


        ArrayList clothingItems = new ArrayList<>();
        clothingItems.add(suit);
        clothingItems.add(coat);
        clothingItems.add(jeans);

        System.out.println(ShopApp.calcTotal(managerCart));
        System.out.println(ShopApp.isAFit(theManager, coat));
        System.out.println(ShopApp.isAFit(hEmployee, suit));
        theManager.printEmpPriceAfterDisc(coat);
        hEmployee.printEmpPriceAfterDisc(jeans);
        ShopApp.printEmployeeName(theManager);
        ShopApp.printEmployeeName(hEmployee);



    }

}
