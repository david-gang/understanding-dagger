package scopes;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules={ConfigurationModule.class})
interface Etl {
    SessionComponent sessionComponent(SessionModule sessionModule);
}
