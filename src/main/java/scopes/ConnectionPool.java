package scopes;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.sql.Connection;

class ConnectionPool {
    private final String dbString;

    @Inject
    ConnectionPool(String dbString) {
        this.dbString = dbString;
    }

     Connection aquireConnection() {
         System.out.println("Aquiring connection");
        return null;
     }
}
