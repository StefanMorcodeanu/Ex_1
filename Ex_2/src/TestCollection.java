import java.io.*;
import java.util.*;
import java.lang.*;

/**
 * Created by Stivie_Mr on 9/10/2016.
 */
class Student{
    int age;
    String name;
    int ID;

    public Student(int ID, String name, int age){
        this.ID = ID;
        this.name = name;
        this.age = age;
    }
}

class AgeComparator implements Comparator{
    public int compare(Object o1, Object o2){
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        if (s1.age == s2.age){
            return 0;
        } else if (s1.age > s2.age){
            return 1;
        }else {
            return -1;
        }
    }
}

 class NameComparator implements Comparator{
    public int compare (Object o1, Object o2){
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        return s1.name.compareTo(s2.name);
    }
}

public class TestCollection {
    public static void main(String[] args) {


        ArrayList lst = new ArrayList();
        lst.add(new Student(1,"Andry",21));
        lst.add(new Student(5, "BigMan", 32));
        lst.add(new Student(3, "Zack", 28));
        lst.add(new Student(4, "Cocy", 22));

        System.out.println("Sorting by age ..\n");

        Collections.sort(lst, new AgeComparator());
        Iterator it = lst.iterator();

        while (it.hasNext()){
            Student st = (Student)it.next();
            System.out.println("ID :"+ st.ID + "  Name: " + st.name + "  Age: " + st.age);
        }

        System.out.println("\n\nSorting by name..");
        Collections.sort(lst, new NameComparator());
        Iterator it2 = lst.iterator();

        while (it2.hasNext()){
            Student st1 = (Student)it2.next();
            System.out.println("ID: " + st1.ID + "  Name: " + st1.name + "  Age:" + st1.age);
        }

    }
}
