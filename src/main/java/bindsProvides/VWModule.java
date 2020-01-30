package bindsProvides;

import dagger.Module;
import dagger.Provides;

@Module
public class VWModule {
    @Provides
    Engine provideVwEngine(){
        return new VWEngine(10);
    }
}
