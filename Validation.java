
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.util.Date;
import java.util.Scanner;

public class Validation {

    Scanner sc = new Scanner(System.in);

    public String getDate() {
        Date date;
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
//        SimpleDateFormat df1 = new SimpleDateFormat("dd-MMM-yyyy");
        df.setLenient(false);// check nếu nhập ngày 40/02-2000 thì báo lỗi
        while (true) {
            try {
                System.out.print("Enter Date: ");
                date = df.parse(sc.nextLine());
                break;
            }catch(Exception e){
                System.out.println("Invalid Date");      
            }
        }
        return df.format(date);
    }

    public int getInt() {
        int a = 0;
        while (true) {
            try {
                System.out.print("Enter ID: ");
                a = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Please input number!");
            }
        }
        return a;
    }

    public int getOption() {
        int a = 0;
        while (true) {
            try {
                a = Integer.parseInt(sc.nextLine());
                if (a >= 1 && a <= 4) {
                    break;
                } else {
                    System.out.println("Please choose option 1-4 !");
                }
            } catch (Exception e) {
                System.out.println("Invalid Option. Please input again!");
            }
        }
        return a;
    }

    public double getDouble() {
        double d = 0;
        while (true) {
            try {
                System.out.print("Enter Amount: ");
                d = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Please input number!");
            }
        }
        return d;
    }

    public String getString() {
        String st = "";
        while (true) {
            System.out.print("Enter Content: ");
            st = sc.nextLine();
            if (!st.trim().isEmpty()) {
                break;
            } else {
                System.out.println("Do not leave it empty");
            }
        }
        return st;
    }
}