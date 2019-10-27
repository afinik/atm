import app.domain.Account;
import app.domain.Treasure;
import collection.AtmCollection;
import collection.impl.ArrayAtmCollection;

import java.util.Date;

public class AtmMain {

    public static void main(String[] args) throws ClassNotFoundException {

        AtmCollection<Account> list = new ArrayAtmCollection<>();

        list.add(new Account("Artem Trunov", new Date(), "1242"));
        list.add(new Account("Ivan Petrov", new Date(), "4542"));



    }
}
