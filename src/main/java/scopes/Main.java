package scopes;

class Main {
    public static void main(String[] args) {
         Etl etl = DaggerEtl.create();
         for(int i=0; i<2; i++){
             SessionModule sessionModule = new SessionModule();
             SessionComponent sessionComponent = etl.sessionComponent(sessionModule);
             DBClient client = sessionComponent.client();
             System.out.println("client1:"+client.toString());
             client = sessionComponent.client();
             System.out.println("client2:"+client.toString());

         }

    }
}
