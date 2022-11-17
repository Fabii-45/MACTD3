package visité;

import visiteur.CalculVisiteur;

public class Chiffre implements Calcul{

    private int chiffre;

    public Chiffre(int chiffre) {
        this.chiffre = chiffre;
    }

    public int getChiffre() {
        return chiffre;
    }

    @Override
    public void accept(CalculVisiteur calculVisiteur) {
        calculVisiteur.visit(this);
    }
}
