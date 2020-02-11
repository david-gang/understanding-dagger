package scopes;


import javax.inject.Inject;

class DBClient {
    private final ConnectionPool connectionPool;
    private final HeavyClass heavyClass;

    private final SessionData sessionData;
    private final SessionManager sessionManager;

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
    DBClient(ConnectionPool connectionPool, HeavyClass heavyClass, SessionData sessionData, SessionManager sessionManager) {
        this.connectionPool = connectionPool;
        this.heavyClass = heavyClass;
        this.sessionData = sessionData;
        this.sessionManager = sessionManager;
    }
}
