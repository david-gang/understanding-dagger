package scopes;


import javax.inject.Inject;

class DBClient {
    private final ConnectionPool connectionPool;

    @Inject
    DBClient(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;

    }
}
