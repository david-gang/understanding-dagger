package bindsProvides;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
abstract class EngineModule {
    @Binds
    abstract Engine getEngine(BenzinEngine engine);
}
