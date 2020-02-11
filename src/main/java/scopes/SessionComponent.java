package scopes;

import dagger.Component;
import dagger.Subcomponent;

@Subcomponent(modules = {SessionModule.class})
@SessionScope
public interface SessionComponent {
    void inject(DBClient client);
}
