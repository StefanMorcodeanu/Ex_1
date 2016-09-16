import java.io.*;

/**
 * Created by Stivie_Mr on 15.09.2016.
 */
public class TestBuffer {
    public static void main(String[] args) throws IOException{
        try{
            InputStream in = new BufferedInputStream( new FileInputStream("D:\\Java-Programming\\Ex_3\\src\\inTestBuffer.data"));
            OutputStream out = new BufferedOutputStream( new FileOutputStream("D:\\Java-Programming\\Ex_3\\src\\outTestBuffer.data"));

            int c;

            while ((c = in.read()) != -1){

                System.out.println(c);
                out.write(c);
            }



        }finally {
            System.out.println("Exceptie");

        }

    }
}
