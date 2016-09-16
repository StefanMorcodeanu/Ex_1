/**
 * Created by Stivie_Mr on 9/5/2016.
 */
public class Individual extends User{
    private String person_address;
    private int person_age;

    public Individual(String name, String surname, String personal_id ,String person_address, int person_age){
        super(name, surname, personal_id);
        this.person_address = person_address;
        this.person_age = person_age;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Person addres is : " + person_address + "\nPerson's age: " + person_age );
    }

}
