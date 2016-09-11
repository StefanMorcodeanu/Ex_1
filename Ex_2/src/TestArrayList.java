/**
 * Created by Stivie_Mr on 9/9/2016.
 */

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

public class TestArrayList {

    public static void main(String[] args) {


        ArrayList<String> st = new ArrayList<String>();
        ArrayList<String> st1 = new ArrayList<String>();
        ArrayList<Integer> in = new ArrayList<Integer>();
        in.add(0,1);
        in.add(1,2);
        in.add(2,3);
        in.add(3,4);
        in.add(4,5);
        in.add(5,6);


        st.add("One");
        st.add("Two");
        st.add("Three");
        st.add("Four");
        st.add("Five");
        st.add("Six");
        st.add("Seven");
        st.add("Eight");
        st.add("Nine");
        st.add("Ten");


        st1.add("One");
        st1.add("Two");
        st1.add("Three");
        st1.add("Four");
        st1.add("Five");



        System.out.println("st + st1 : "+ st1.addAll(st));
        System.out.println("Check if st contain st1 onjects: "+ st1.contains(st));
        System.out.println(st1.removeAll(st));
        System.out.println("st contains :"+st);
        System.out.println("st1 contains: "+st1);

        System.out.println("Before " + " "+ st + " ");
        st.remove(5);
        System.out.println("After" + " " + st + "");
        st.add(5,"6");
        System.out.println("After"+ " " + st + "");
        System.out.println("String size is: "  + st.size());
        System.out.println("Hashcode of string is: " + st.hashCode());
        System.out.println("Check if in object contain elements from st object : " + in.contains(st));
        System.out.println("Check if in obj is empty: " + in.isEmpty());

        Collections.sort(st);
        System.out.println("st was sorted " +st );






    }

}
