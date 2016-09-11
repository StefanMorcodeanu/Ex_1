import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Stivie_Mr on 9/10/2016.
 */
public class TestHashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();

        hashtable.put(1,"A");
        hashtable.put(5, "C");
        hashtable.put(3, "B");
        hashtable.put(7, "D");

        for (Map.Entry s: hashtable.entrySet()){
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
