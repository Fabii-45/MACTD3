package visité;

import visiteur.FormuleVisiteur;

public class Faux implements Formule{
    @Override
    public void accept(FormuleVisiteur formuleVisiteur) {
        formuleVisiteur.visit(this);
    }
}
