package store;

import app.domain.Account;
import app.domain.Nominal;
import app.domain.Treasure;
import collection.AccountCollection;
import collection.AtmCollection;


public class Storage {

    private static AtmCollection<Treasure> treasures;
    private static AtmCollection<Account> accounts;

    static {
        loadTreasures();
        loadAccounts();
    }

    private static void loadTreasures() {
    }

    private static void loadAccounts() {

        //accounts

    }


}
