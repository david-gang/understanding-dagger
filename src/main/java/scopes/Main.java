package scopes;

class Main {
    public static void main(String[] args) {
         Etl etl = DaggerEtl.create();
         for(int i=0; i<2; i++){
             etl.sessionComponent(new SessionModule());
             DBClient client1 = etl.client();
             System.out.println("client1:"+client1.toString());

             DBClient client2 = etl.client();
             System.out.println("client2:"+client1.toString());

         }

    }
}
