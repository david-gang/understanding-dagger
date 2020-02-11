package scopes;


import javax.inject.Inject;

class DBClient {
    private final ConnectionPool connectionPool;
    private final HeavyClass heavyClass;

    @Override
    public String toString() {
        return "DBClient{" +
                "connectionPool=" + connectionPool +
                ", heavyClass=" + heavyClass +
                ", sessionData=" + sessionData +
                '}';
    }

    private final SessionData sessionData;

    @Inject
    DBClient(ConnectionPool connectionPool, HeavyClass heavyClass,SessionData sessionData) {
        this.connectionPool = connectionPool;
        this.heavyClass = heavyClass;
        this.sessionData = sessionData;

    }
}
