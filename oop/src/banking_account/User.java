package banking_account;

/**
 * Created by Stivie_Mr on 9/5/2016.
 */
public class User {
    private String name;
    private String surname;
    private String personal_id;
    private String user_password;
    private String user_id;
    private String current_account;


    public User(String name, String surname, String personal_id){
        this.name = name;
        this.surname = surname;
        this.personal_id = personal_id;
    }

    //Overriding
    public void showInfo(){
        System.out.println("\nName: "+ name + "\nSurname: " + surname + "\nPersonal ID: " + personal_id +
                "\nbanking_account.User password: " + user_password +
                "\nbanking_account.User id: " + user_id +
         "\nCurrent account: " + current_account);
    }

    //Incapsulation
    public void setUser_id(String user_id){
        this.user_id = user_id;
    }

    public String getUser_id(){
        return user_id;
    }

    public void setUser_password(String user_password){
        this.user_password  = user_password;
    }

    public String getUser_password(){
        return user_password;
    }

    public void setCurrent_account(String current_account){
        this.current_account = current_account;
    }

    public String getCurrent_account(){
        return current_account;
    }

}
