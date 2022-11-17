package visité;

import visiteur.CalculVisiteur;

public class Plus implements Calcul{

    private Calcul calculGauche;
    private Calcul calculDroite;

    public Plus(Calcul calculGauche, Calcul calculDroite) {
        this.calculGauche = calculGauche;
        this.calculDroite = calculDroite;
    }

    public Calcul getCalculGauche() {
        return calculGauche;
    }

    public Calcul getCalculDroite() {
        return calculDroite;
    }

    @Override
    public void accept(CalculVisiteur calculVisiteur) {
        calculVisiteur.visit(this);
    }
}
