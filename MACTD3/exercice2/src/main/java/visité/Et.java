package visité;

import visiteur.FormuleVisiteur;

public class Et implements Formule{
    private Formule formuleGauche;
    private Formule formuleDroite;
    public Et(Formule fgauche, Formule fdroite) {

    }

    @Override
    public void accept(FormuleVisiteur formuleVisiteur) {
        formuleVisiteur.visit(this);
    }
}
