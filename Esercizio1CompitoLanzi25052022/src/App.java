public class App {
    public static void main(String[] args) throws Exception {
        Ciccio c = new Ciccio("ciccio");
        Ciccio r = new Ciccio("riccardo");

        System.out.println("Inizio della partita");
        System.out.println("giocatore in attesa " + c.getName());
        System.out.println("giocatore in attesa " + r.getName());
        c.start();
        r.start();
        c.join();
        r.join();
        if(c.getTot() == r.getTot())
            System.out.println("pareggio con risultato = " + c.getTot());
        else if(c.getTot() > r.getTot())
            System.out.println(c.name + " e' il vincitore con il risultato di " + c.getTot());
        else
            System.out.println(r.name + " e' il vincitore con il risultato di " + r.getTot());
        }
}
