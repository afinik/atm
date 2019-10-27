package store;

import app.domain.Account;
import app.domain.Nominal;
import app.domain.Treasure;
import collection.AccountCollection;


public class Storage {

    private static Treasure[] treasures;
    private static AccountCollection accounts;

    static {
        treasures = new Treasure[Nominal.values().length];

        for (int i = 0; i < treasures.length; i++) {
            treasures[i] = new Treasure();
            treasures[i].setNominal(Nominal.values()[i]);
            treasures[i].setAmount(100);
        }

        loadAccounts();


    }

    private static void loadAccounts() {

        //accounts

    }


}
