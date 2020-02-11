package scopes;

import dagger.Module;
import dagger.Provides;

@Module
class SessionModule {
    @Provides
    @SessionScope
    SessionData provideSessionData() {
        return new SessionData();
    }
    @Provides
    @SessionScope
    SessionManager provideSessionManager(SessionData sessionData) {
        return new SessionManager(sessionData);
    }
}
