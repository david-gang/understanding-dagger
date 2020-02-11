package bindsInto;

import javax.inject.Inject;
import javax.inject.Provider;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class MyJobFactory implements JobFactory{
    private final Map<Class<? extends Job>, Provider<Job>> jobMap;

@Inject
    MyJobFactory(Map<Class<? extends Job>, Provider<Job>> jobMap){
        this.jobMap = jobMap;
    }

    @Override
    public Job createJob(Class<? extends Job> jobClass) {
        return jobMap.get(jobClass).get();
    }
}
