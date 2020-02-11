package bindsInto;

import java.lang.reflect.InvocationTargetException;

public interface JobFactory {
    Job createJob(Class<? extends Job> jobClass) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException;
}
