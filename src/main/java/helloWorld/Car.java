package helloWorld;

import javax.inject.Inject;

class Car {
    private final Engine engine;

    @Inject
    public Car(Engine engine){
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("vroom vroom");
    }
}
