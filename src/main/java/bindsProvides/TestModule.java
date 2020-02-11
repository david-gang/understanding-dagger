package bindsProvides;

import dagger.Module;
import dagger.Provides;

@Module
class TestModule {
    @Provides
    Engine provideVwEngine(){
        return new TestEngine(10);
    }
}
