package visité;

import visiteur.FormuleVisiteur;

public class Vrai implements Formule{
    @Override
    public void accept(FormuleVisiteur formuleVisiteur) {
        formuleVisiteur.visit(this);
    }
}
