import java.io.*;

/**
 * Created by Stivie_Mr on 9/14/2016.
 */
public class TestArray {
    public static void main(String[] args)  {

        try {

            byte bwrite [] = {10,11,12,13,14,15};
            OutputStream outputStream = new FileOutputStream("D:\\Java-Programming\\Ex_3\\src\\arraytest.dat");
            for (int i=0; i < bwrite.length; i++){
                outputStream.write(bwrite[i] );

            }
            outputStream.close();

            InputStream inputStream = new FileInputStream("D:\\Java-Programming\\Ex_3\\src\\arraytest.dat");
            int size = inputStream.available();

            for (int i = 0; i < size; i++){
                System.out.println((char) inputStream.read() + " ");
            }
            inputStream.close();

        }catch (IOException e){
            System.out.println("Exceptie: " + e);

        }

    }
}
