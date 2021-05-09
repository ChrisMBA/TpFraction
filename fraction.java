public class Fraction{
    public static void name(String[] args) {
        Fraction f = new Fraction(6,9);
        Fraction g = new Fraction(7,4);
    
        f.affiche();
        g.affiche();

        f.getNumerateur();
        f.getDenominateur();
        
        g.getNumerateur();
        g.getDenominateur();

        f.additionne(g);
        
        f.soustrait(g);

        f.multiplie(g);

        f.divise(g);

        f.pgcd(g);
    
    }
}
