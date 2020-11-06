
import java.util.ArrayList;
import java.util.Locale;

public class Option {
    Validation v = new Validation();
    
    ArrayList<Expense> list = new ArrayList<>();
    
    public static void Menu() {
        System.out.println("=======Handy Expense program======");
        System.out.println("1. Add an expense");
        System.out.println("2. Display all expenses");
        System.out.println("3. Remove an expense");
        System.out.println("4. Exit");
    }
    
    public void displayExpense() {
        System.out.println("---------Display all expenses------------");
        if (list.isEmpty()) {
            System.out.println("Don't have any expenses");
        } else {
            System.out.println(String.format("%s%20s%20s%20s", "ID", "DATE", "AMOUNT", "CONTENT"));
            double total = 0;
            for (Expense expense : list) {
                System.out.println(expense);
                total += expense.getAmount();
            }
            System.out.println("\t\tTotal:\t" + total);
        }
    }
    
    public void addExpense() {
        System.out.println("-------- Add an expense--------");
//        int id = 0;
//        int lastID = list.size() - 1;
//        if (list.isEmpty()) {
//            id = 1;
//        } else {
//            id = list.get(lastID).getId() + 1;
//        }
//        list.add(new Expense(id, date, amount, content));
         String date = v.getDate();
        list.add(new Expense(1, date, 5.6, "abc"));
//        list.add(new Expense(2, "20-2-2020", 5.6, "abc"));
//        list.add(new Expense(3, "20-2-2020", 5.6, "abc"));
//        list.add(new Expense(4, "20-2-2020", 5.6, "abc"));
        System.out.println("Add expense successful");
    }
    
    public void removeExpense(int id) {
        System.out.println("--------Delete an expense------");
        if (list.isEmpty()) {
            System.out.println("Don't have any expenses");
        } else {
            boolean check = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == id) {
                    check = true;
                    list.remove(i);
                    System.out.println("Delete an expense successful");
                    break;
                }
            }
            if (check == false) {
                System.out.println("Delete fail");
            }
            for (int i = 0; i < list.size(); i++) {
                list.get(i).setId(i + 1);
            }
        }
    }
}
