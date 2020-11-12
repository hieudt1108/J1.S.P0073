
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hieudt
 */
public class Filehandling {

    public void write(ArrayList<Doctor> list) {  //ghi theo Object
        for (Doctor doctor : list) {
            System.out.println(doctor.toString());
        }

        try {   // dat try cacth de tranh ngoai le khi tao va ghi File
            FileOutputStream f = new FileOutputStream("doctor.txt");   // tao file f tro den student.dat
            ObjectOutputStream oStream = new ObjectOutputStream(f); // dung de ghi theo Object vao file f
            oStream.writeObject(list);   // ghi student theo kieu Object vao file
//            oStream.close();
        } catch (IOException e) {
            System.out.println("Error Write file");
        }
    }

    public ArrayList<Doctor> read() {       // doc theo Object
        ArrayList<Doctor> doctor =new ArrayList<>();
        try {   // dat try cacth de tranh ngoai le khi tao va doc File
            FileInputStream f = new FileInputStream("doctor.txt"); // tao file f tro den student.dat
            ObjectInputStream inStream = new ObjectInputStream(f);  // dung de doc theo Object vao file f
            // dung inStream doc theo Object, ep kieu tra ve la Student
            doctor = (ArrayList<Doctor>) inStream.readObject();
//            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.err.println("loi");
            return doctor;
            
        }
        return doctor;
    }
}
