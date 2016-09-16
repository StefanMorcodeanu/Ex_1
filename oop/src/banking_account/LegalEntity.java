package banking_account;

/**
 * Created by Stivie_Mr on 9/5/2016.
 */
public class LegalEntity extends User {

    private String companyName;
    private String companyAdress;
    private int yearStarupCompany;


    public LegalEntity (String name, String surname, String personal_id  ,String companyName, String companyAdress, int yearStarupCompany){
        super(name, surname, personal_id);
        this.companyName = companyName;
        this.companyAdress = companyAdress;
        this.yearStarupCompany = yearStarupCompany;
    }
    //Inheritance and Polymorphism
    public void showInfo(){
        super.showInfo();
        System.out.println("Company Name: " + companyName + "\nCompany Adress: " + companyAdress + "\nYear of founding company: " + yearStarupCompany);
    }






}
