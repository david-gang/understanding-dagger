package lazy;

import dagger.Component;

@Component
public interface AppComponent {
    void inject(Main main);

}
