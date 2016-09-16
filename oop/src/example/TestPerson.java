/**
 * Created by Stivie_Mr on 9/5/2016.
 */
public class TestPerson {
    public static void main(String[] args) {

        Student s1 = new Student("Tom Clancy", "Boston 27 street");
        s1.addCourseGrade("BMTS", 9);
        s1.addCourseGrade("SOBD", 10);
        s1.printGrades();
        System.out.println("Average is: " + s1.getAverageGrade());

        Teacher t1 = new Teacher("Mr Tom Bickshop", "Indian 7 street");
        System.out.println(t1);
        String[] courses = {"Math", "Physic", "Biology", "Math"};

        for (String course: courses) {
            if (t1.addCourses(course)){
                System.out.println(course + " added.");
            }else {
                System.out.println(course + " cannot be added.");
            }
        }

        for (String course: courses){
            if(t1.removeCourse(course)){
                System.out.println(course + " removed.");
            }else {
                System.out.println(course + " cannot be removed.");
            }
        }


    }
}
