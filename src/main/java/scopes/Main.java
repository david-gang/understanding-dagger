package scopes;

class Main {
    public static void main(String[] args) {
         Etl etl = DaggerEtl.create();
         DBClient client1 = etl.client();
        System.out.println(" client1 Making something interesting");
        DBClient client2 = etl.client();
        System.out.println(" client2 Making something interesting");
    }
}
