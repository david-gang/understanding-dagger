package bindsInto;

public class HelloJob implements Job {
    private final String name;

    HelloJob(String name){
        this.name = name;
    }
    @Override
    public void runJob() {
        System.out.println("Hello "+name);
    }
}
