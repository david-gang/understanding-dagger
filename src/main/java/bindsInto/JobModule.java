package bindsInto;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;

@Module
abstract class JobModule {
    @Binds
    abstract JobFactory bindJobFactory(MyJobFactory myJobFactory);
    @Binds
    @IntoMap
    @JobKey(HelloJob.class)
    abstract Job bindHelloJob(HelloJob job);

    @Binds
    @IntoMap
    @JobKey(ByeJob.class)
    abstract Job bindByeJob(ByeJob job);

    @Provides
    static HelloJob provideHelloJob() {
        return new HelloJob("David");
    }

    @Provides
    static ByeJob provideByeJob() {
        return new ByeJob("David");
    }
}
