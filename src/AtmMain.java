import app.domain.Account;
import app.domain.Treasure;
import collection.AtmCollection;
import collection.impl.ArrayAtmCollection;
import repository.StorageRepository;
import repository.factory.StorageFactory;
import repository.impl.FileRepository;
import repository.impl.InMemoryRepository;
import store.Storage;

import java.util.Date;

public class AtmMain {

    public static void main(String[] args) throws ClassNotFoundException {

        StorageRepository storage = StorageFactory.getStorage();

        AtmCollection<Account> list1 = storage.getAccounts();
        AtmCollection<Treasure> list2 = storage.getTreasure();

        System.out.println();



    }
}
