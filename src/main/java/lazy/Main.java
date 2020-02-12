package lazy;

import bindsProvides.DaggerGarage;
import bindsProvides.Garage;
import dagger.Lazy;

import javax.inject.Inject;

public class Main {
    @Inject
    Lazy<ExpensiveObject> lazy;

    public static void main(String[] args) {
        AppComponent component = DaggerAppComponent.create();
        Main main = new Main();
        component.inject(main);
        System.out.println("Injection worked");
        main.lazy.get();
    }
}
