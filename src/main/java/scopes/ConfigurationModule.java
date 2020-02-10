package scopes;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class ConfigurationModule {
    @Singleton
    @Provides
    ConnectionPool provideConfiguration() {
        return new ConnectionPool("server=myServerAddress;Database=myDataBase;Uid=myUsername;Pwd=myPassword;");
    }
}
