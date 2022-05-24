/**
 * Questa e' una classe di nome Ciccio estesa al Thread, dove possiamo in questo caso far tirare dei numeri randomici che permettano di fare il risultato dei dadi
 * @author Guido Lanzi
 */
public class Ciccio extends Thread{
    /**
     * Nome del giocatore
     */
    protected String name;
    /**
     * Risultato della somma dei dadi
     */
    protected int tot = 0;
    /**
     * Funzione che serve per vedere se il giocatore è pronto
     */
    private boolean as = true;

    /**
     * Questo è il costruttore della classe estesa al thread
     * @param name il nome del giocatore
     */
    public Ciccio(String name) {
        this.name = name;
        this.setName(this.name);
    }

    /**
     * Ritorna il risultato dei dadi
     * @return risultato somma dadi
     */
    public int getTot()
    {
        return tot;
    }

    /**
     * Questa funzione override del Thread permette, in questo caso di far tirare i dadi ad un giocatore e far uscire i vari risultati
     */
    @Override
    public void run() {
        if (as) {
            as = false;
            System.out.println("giocatore si è unito alla partita: " + this.name);
        }
        int l = 0;
        int r = 0;
        r = (int)(Math.random()*6)+1;
        l = (int)(Math.random()*6)+1;
        this.tot = r + l;
        System.out.println("risultato dei dadi di " + this.name + " sono: " + l + " " + r );
        if (l == r) {
            System.out.println("Lancio bonus per " + this.name);
            int p = (int)(Math.random()*6)+1;
            tot += p;

            System.out.println("Risultato del dado bonus " + this.name + " e': " + p);
            System.out.println("|Risultato finale di " + this.name + " = " + tot + "|");
        } else {
            System.out.println("|Risultato finale di " + this.name + " = " + tot + "|");
        }
        System.out.println("operazione terminata di " + this.name);
    }
}
