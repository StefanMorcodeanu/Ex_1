import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by Stivie_Mr on 9/9/2016.
 */
public class TestTreeSet {
    public static void main(String[] args) {
        List <String> lst = new ArrayList<String>();
        lst.add("C");
        lst.add("X");
        lst.add("Z");
        lst.add("A");
        lst.add("G");
        lst.add("F");

        System.out.println("List contains: " + lst);

        TreeSet<String> treeSet = new TreeSet<String >(lst);
        System.out.println("The same list but using treeset : "+treeSet);
        System.out.println("First element is : " + treeSet.first());
        System.out.println("Last element is : " + treeSet.last());
    }
}
