import app.domain.Account;
import app.domain.Treasure;
import collection.AtmCollection;
import collection.impl.ListAtmCollection;
import repository.StorageRepository;
import repository.factory.StorageFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.time.Duration;
import java.time.Instant;
import java.util.Deque;


public class AtmMain{

    public static void main(String[] args){

        Instant start = Instant.now();

        ListAtmCollection atmCollection = new ListAtmCollection();
        atmCollection.append(1);
        atmCollection.append(2);
        atmCollection.append(3);
        atmCollection.append(4);


        boolean item = atmCollection.remove(3);

        Instant stop = Instant.now();
        System.out.println(Duration.between(start, stop));



    }
}
