package bindsProvides;

import dagger.Component;

@Component(modules = {VWModule.class})
public interface VWGarage {
    Car car();
}
