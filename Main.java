
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = 0;
        Validation v = new Validation();
        Scanner sc = new Scanner(System.in);
        Option o = new Option();
        while (true) {
            o.Menu();
            System.out.print("Your choice: ");
            choice = v.getOption();
            switch (choice) {
                case 1:
//                    String date = v.getDate();
//                    double amount = v.getDouble();
//                    String content = v.getString();
                    o.addExpense();
                    break;
                case 2:
                    o.displayExpense();
                    break;
                case 3:
                    int id = v.getInt();
                    o.removeExpense(id);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
