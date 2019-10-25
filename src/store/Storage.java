package store;

import app.domain.Account;
import app.domain.Nominal;
import app.domain.Treasure;


public class Storage {

    private static Treasure[] treasures;
    private static Account[] accounts;

    static {
        treasures = new Treasure[Nominal.values().length];

        for (int i = 0; i < treasures.length; i++) {
            treasures[i] = new Treasure();
            treasures[i].setNominal(Nominal.values()[i]);
            treasures[i].setAmount(100);
        }


    }


}
