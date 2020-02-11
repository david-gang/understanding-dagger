package scopes;


import javax.inject.Inject;

class DBClient {
    private final ConnectionPool connectionPool;
    private final HeavyClass heavyClass;

    @Inject
    SessionData sessionData;
    @Inject
    SessionManager sessionManager;

    @Override
    public String toString() {
        return "DBClient{" +
                "connectionPool=" + connectionPool +
                ", heavyClass=" + heavyClass +
                ", sessionData=" + sessionData +
                ", sessionManager=" + sessionManager +
                '}';
    }

    @Inject
    DBClient(ConnectionPool connectionPool, HeavyClass heavyClass) {
        this.connectionPool = connectionPool;
        this.heavyClass = heavyClass;
    }
}
