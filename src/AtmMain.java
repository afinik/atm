import app.domain.Account;
import app.domain.Treasure;
import collection.AtmCollection;
import collection.impl.ArrayAtmCollection;
import store.Storage;

import java.util.Date;

public class AtmMain {

    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("store.Storage");

        AtmCollection<Account> list1 = Storage.getAccounts();
        AtmCollection<Treasure> list2 = Storage.getTreasures();

        System.out.println();



    }
}
