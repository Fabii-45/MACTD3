package visité;

import visiteur.FormuleVisiteur;

public class Inconnu implements Formule{
    @Override
    public void accept(FormuleVisiteur formuleVisiteur) {
        formuleVisiteur.visit(this);
    }
}
