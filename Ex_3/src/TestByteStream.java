import java.io.*;
/**
 * Created by Stivie_Mr on 9/12/2016.
 */

public class TestByteStream {
    public static void main(String[] args) throws IOException{

        FileInputStream inputStream = new FileInputStream("D:\\Java-Programming\\Ex_3\\src\\info.dat");
        FileOutputStream outputStream = new FileOutputStream("D:\\Java-Programming\\Ex_3\\src\\out.dat");

        try {
            int c;
            while((c = inputStream.read()) != -1){
                outputStream.write(c);
            }

        }finally {
            if(inputStream != null){
                inputStream.close();
            }

            if(outputStream != null){
                outputStream.close();
            }

        }

    }
}
