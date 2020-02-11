package scopes;

import dagger.Reusable;

import javax.inject.Inject;
@Reusable
class HeavyClass {
    @Inject
    HeavyClass(){
        System.out.println("Initialization is heavy");
    }
}
