# understanding-dagger

## helloWorld

Minimalistic example without modules.

The code in DaggerGarage.java is like handwritten code.

``` java
@Override
  public Car car() {
    return new Car(new Engine());}
```


## bindsProvides

* Module - set of dependencies

* Enables tests

* Binds is done in compile time (Garage.java)

* Provides is injected in runtime (TestGarage.java)

* provider - jsr-330


## scopes

* SessionScope - SessionData and SessionManager is in same scope so constructor works
* DBClient is in different scope so we can inject
* DoublecheckProvider ensures that ut is same object
* Singleton is just a scope

## bindsInto

* Communicate with external framework through factories
* bindsinto

## lazy 

* Object gets created on get call
* Demonstrate inject
