package bindsInto;

import dagger.Component;

import javax.inject.Provider;
import java.util.Map;

@Component(modules={JobModule.class})
public interface JobComponent {
    JobFactory jobFactory();
}
