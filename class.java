public class Fraction {

    public int numerateur;
    public int denominateur;


    public Fraction(int a,int b) {
        this.numerateur = a;
        this.denominateur = b;
    }

    //getNumerateur
    public int getNumerateur(Fraction f){
        return this.numerateur;
    }

    //getDenominateur
    public int getDenominateur(Fraction f){
        return this.denominateur;
    }

    //Afficher la fraction
    public Fraction affiche(Fraction f) {
        String resultat = this.numerateur + "/" + this.denominateur;
        System.out.println(resultat);
    }

    //Inverser la fraction
    public Fraction inverse(Fraction f) {
        String inverse = this.denominateur + "/" + this.numerateur;
        System.out.println(inverse);
    }

    //Calculer le PGCD
    public Fraction pgcd() {


    public int PGCD(int p,int q){
        while (p!=q){
            if(p>q!=0) p -= q;
            else q -= p;
        }
        return p;
    }

    //Additionner
    public Fraction additionne() {
        int a = (this.numerateur * f.numerateur) + (this.denominateur * f.denominateur);
        int b = this.denominateur * f.denominateur ;
        return new Fraction(a,b);
    }

    //Soustraire
    public Fraction soustrait() {
        int a = (this.numerateur * f.numerateur) - (this.denominateur * f.denominateur);
        int b = this.denominateur * f.denominateur ;
        return new Fraction(a,b);
    }

    //Multiplier
    public Fraction multiplie() {
        int a = this.numerateur * f.numerateur;
        int b = this.denominateur * f.denominateur;
        return new Fraction(a,b);
    }

    //Diviser
    private Fraction divise() {
        int a = this.numerateur * f.denominateur;
        int b = this.denominateur * f.numerateur;
        return new Fraction(a,b);
    }

}
