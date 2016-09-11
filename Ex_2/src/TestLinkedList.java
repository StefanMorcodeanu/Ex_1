import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Stivie_Mr on 9/9/2016.
 */
public class TestLinkedList {
    public static void main(String[] args) {

        List<String> ls = new ArrayList<String >();
        List<String> linked = new LinkedList<String>();
        HashSet <String> lst = new HashSet<String>();

        ls.add("B");
        ls.add("F");
        ls.add("H");
        ls.add("A");
        ls.add("A");

        linked.add("1");
        linked.add("2");
        linked.add("3");
        linked.add("5");
        linked.add("5");



        System.out.println("ls size is " + ls.size() + " and containt " + ls + " " );
        System.out.println("linked size is " + linked.size() + " and containt " + linked + " " );
        linked.addAll(ls);
        System.out.println(linked);
        System.out.println("Adding new element : " );
        linked.add(10,"10");
        System.out.println(linked);
        System.out.println("Linked size: " + linked.size());
        System.out.println(linked.remove("10"));
        System.out.println(linked);

        lst.addAll(linked);
        System.out.println("lst can't contain same elements two or more time in list :"+ lst);




    }
}
