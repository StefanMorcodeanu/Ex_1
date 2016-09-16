import java.util.*;


/**
 * Created by Stivie_Mr on 9/9/2016.
 */
public class TestMap {
    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        LinkedHashMap <Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();

        linkedHashMap.put(1, "A");
        linkedHashMap.put(5, "C");
        linkedHashMap.put(2, "B");
        linkedHashMap.put(3,"D");


        hashMap.put(111,"John");
        hashMap.put(222,"Stivie");
        hashMap.put(333,"Criss");

        for (Map.Entry m:hashMap.entrySet()){
            System.out.println(m.getKey() +" "+ m.getValue());
        }

            System.out.println("\n");

        for (Map.Entry s:linkedHashMap.entrySet()){
            System.out.println(s.getKey() + " " + s.getValue());
        }

    }
}
