package scopes;

class Main {
    public static void main(String[] args) {
         Etl etl = DaggerEtl.create();
        DBClient client= etl.client();
         for(int i=0; i<2; i++){
             SessionModule sessionModule = new SessionModule();
             SessionComponent sessionComponent = etl.sessionComponent(sessionModule);
            sessionComponent.inject(client);
             System.out.println("client1:"+client.toString());
            sessionComponent.inject(client);
             DBClient client2 = etl.client();
             System.out.println("client2:"+client.toString());

         }

    }
}
