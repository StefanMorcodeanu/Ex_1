import java.io.*;

/**
 * Created by Stivie_Mr on 15.09.2016.
 */
public class TestSequenceStream {
    public static void main(String[] args) throws IOException{

        InputStream input = new FileInputStream("D:\\Java-Programming\\Ex_3\\src\\info.dat");
        InputStream input1 = new FileInputStream("D:\\Java-Programming\\Ex_3\\src\\incharacter.dat");
        OutputStream out = new FileOutputStream("D:\\Java-Programming\\Ex_3\\src\\combinedInfo.data");

        SequenceInputStream sequence = new SequenceInputStream(input,input1);

        int info = sequence.read();

        try {

            while (info != -1) {
                System.out.println( sequence.read());

                info = sequence.read();
                out.write(info);
                System.out.println();
                

            }


        } finally {
            System.out.println("OK");
        }



    }
}
