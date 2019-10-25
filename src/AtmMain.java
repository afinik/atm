import app.domain.Account;
import collection.AccountCollection;
import store.Storage;

import java.util.Date;

public class AtmMain {

    public static void main(String[] args) throws ClassNotFoundException {
        AccountCollection acc = new AccountCollection(2);
        acc.add(new Account("dadsa", new Date(),"dadsa"));
        acc.add(new Account("dadsa", new Date(),"dadsa"));
        acc.add(new Account("dadsa", new Date(),"dadsa"));



        System.out.println(acc.size());


        while(true){}

    }
}
