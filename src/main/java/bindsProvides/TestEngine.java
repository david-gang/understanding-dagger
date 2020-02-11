package bindsProvides;

public class TestEngine implements Engine {
    private final double fakeValue;

    TestEngine(double fakeValue){
        this.fakeValue = fakeValue;
    }
    @Override
    public void start() {
        System.out.println("Ich bin Sauber");
    }

    @Override
    public double getPollution(double velocity) {
        return fakeValue;
    }
}
