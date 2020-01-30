package bindsProvides;

import javax.inject.Inject;

public class ElectricEngine implements Engine {
    @Inject
    ElectricEngine() {

    }
    @Override
    public void start() {
        System.out.println("I am clean");
    }

    @Override
    public double getPollution(double velocity) {
        return 0;
    }
}
