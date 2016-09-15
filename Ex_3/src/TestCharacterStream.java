import java.io.*;
/**
 * Created by Stivie_Mr on 9/14/2016.
 */
public class TestCharacterStream  {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("D:\\Java-Programming\\Ex_3\\src\\incharacter.dat");
        FileWriter fileWriter = new FileWriter("D:\\Java-Programming\\Ex_3\\src\\outcharacter.dat");

        try{
            int c;
            while ((c = fileReader.read()) != -1){
                fileWriter.write(c);
            }

        }finally {
            if (fileReader != null){
                fileReader.close();
            }

            if (fileWriter != null){
                fileWriter.close();
            }

        }

    }
}
