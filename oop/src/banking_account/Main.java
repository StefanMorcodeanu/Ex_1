package banking_account;

/**
 * Created by Stivie_Mr on 9/6/2016.
 */
public class Main {
    public static void main(String[] args) {

        LegalEntity company = new LegalEntity("Bill", "Gates", "A24054327", "Microsoft Inc", "Avenue 23 street", 1998 );

        company.setUser_id("loggin1@");
        company.setUser_password("qazwsx123");
        company.setCurrent_account("5000$");
        company.showInfo();
        company.getUser_id();
        company.getUser_password();
        company.getCurrent_account();

        Individual person = new Individual("John", "Roberts", "A44283579", "California 18 street", 48);

        person.setUser_id("loggin2@");
        person.setUser_password("qweasdzxc123");
        person.setCurrent_account("1000$");
        person.showInfo();
        person.getUser_id();
        person.getUser_password();
        person.getCurrent_account();

    }
}
