package bindsInto;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        JobComponent component = DaggerJobComponent.create();
        JobFactory factory = component.jobFactory();
        JobScheduler scheduler = new JobScheduler(factory);
        scheduler.runJob(1, TimeUnit.SECONDS, HelloJob.class);
    }

}
