package bindsProvides;

import javax.inject.Inject;
import java.util.concurrent.*;

public class Car {
    private final ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
    private final ScheduledFuture<?> scheduledFuture;
    private  double currentVelocity = 0;
    private  double desiredVelocity = 0;
    private final Engine engine;

    @Inject
    public Car(Engine engine){
        this.engine = engine;
        scheduledFuture = service.scheduleAtFixedRate(this::adjustSpeed, 0, 1, TimeUnit.SECONDS);

    }

    private synchronized void adjustSpeed() {
        double diff = desiredVelocity - currentVelocity;
        if(Math.abs(diff) <1){
            return;
        }
        currentVelocity = currentVelocity + diff/2;
        System.out.println("Pollution for "+currentVelocity+" is "+ engine.getPollution(currentVelocity));
    }
    public void stop() {
        scheduledFuture.cancel(false);
        service.shutdown();
    }

    public synchronized void drive(double velocity) {
        engine.start();
        System.out.println("vroom vroom");
        this.desiredVelocity = velocity;
    }

}
