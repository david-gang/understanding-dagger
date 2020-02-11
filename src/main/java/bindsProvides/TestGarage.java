package bindsProvides;

import dagger.Component;

@Component(modules = {TestModule.class})
public interface TestGarage {
    Car car();
}
