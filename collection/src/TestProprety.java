import java.io.*;
import java.util.*;


/**
 * Created by Stivie_Mr on 9/10/2016.
 */
public class TestProprety {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("D:\\Java-Programming\\Ex_2\\src\\database.txt");

        Properties p = new Properties();
        p.load(reader);
        p.setProperty("email", "sorosgroup@gmail.com");
        p.store(new FileWriter("D:\\Java-Programming\\Ex_2\\src\\database.txt"), "Myfile");
        System.out.println(p.getProperty("name"));
        System.out.println(p.getProperty("surname"));
        System.out.println(p.getProperty("age"));
        System.out.println(p.getProperty("address"));
        System.out.println(p.getProperty("email"));


    }
}
