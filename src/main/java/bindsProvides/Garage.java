package bindsProvides;

import dagger.Component;

@Component(modules = {EngineModule.class})
public interface Garage {
    Car car();
}
