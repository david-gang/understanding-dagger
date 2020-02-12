package lazy;

import javax.inject.Inject;

public class ExpensiveObject {
    @Inject
    ExpensiveObject() {
        System.out.println("I am an expensive object");
    }
}
