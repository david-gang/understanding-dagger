package bindsProvides;

import javax.inject.Inject;

public class BenzinEngine implements Engine {
    @Inject
    BenzinEngine() {

    }

    @Override
    public void start() {
        System.out.println("I am  making Schmutz");
    }

    @Override
    public double getPollution(double velocity) {
        return velocity*0.5;
    }
}
