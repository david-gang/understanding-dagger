package bindsInto;

public class ByeJob implements Job{
    private final String name;

    ByeJob(String name){
        this.name = name;
    }
    @Override
    public void runJob() {
        System.out.println("Bye "+name);
    }
}
