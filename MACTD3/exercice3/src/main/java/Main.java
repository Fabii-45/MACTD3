import visiteur.CalculVisiteur;
import visiteur.CalculVisiteurImpl;
import visité.Chiffre;
import visité.Moins;
import visité.Multiplie;
import visité.Plus;

public class Main {
    public static void main(String[] args) {

        Chiffre chiffre1 = new Chiffre(1);
        Chiffre chiffre2 = new Chiffre(2);
        Chiffre chiffre4 = new Chiffre(4);
        Chiffre chiffre5 = new Chiffre(5);
        Plus plus = new Plus(chiffre1,chiffre2);
        Moins moins = new Moins(chiffre4,chiffre5);

        Multiplie multiplication = new Multiplie(plus, moins);

        CalculVisiteur visiteur = new CalculVisiteurImpl();

        visiteur.visit(multiplication);

    }
}
