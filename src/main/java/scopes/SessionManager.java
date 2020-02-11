package scopes;

import javax.inject.Inject;

public class SessionManager {
    @Override
    public String toString() {
        return "SessionManager{" +
                "sessionData=" + sessionData +
                '}';
    }

    private final SessionData sessionData;

    @Inject
    SessionManager(SessionData sessionData){
        this.sessionData = sessionData;

    }
}
