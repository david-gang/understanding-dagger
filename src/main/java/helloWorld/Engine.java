package helloWorld;

import javax.inject.Inject;

class Engine {
    @Inject
    Engine() {
    }
    public void start() {
        System.out.println("starting engine");
    }
}
