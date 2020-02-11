package bindsInto;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

class JobScheduler {
    private final JobFactory factory;
    JobScheduler() {
        this.factory = jobClass -> jobClass.getDeclaredConstructor().newInstance();
    }

    JobScheduler(JobFactory factory) {
        this.factory = factory;
    }
    void runJob(int num, TimeUnit unit, Class<? extends Job> jobClass){
        System.out.println("sleeping for "+num+" "+ unit);
        try {
            factory.createJob(jobClass).runJob();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
