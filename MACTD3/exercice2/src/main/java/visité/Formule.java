package visité;

import visiteur.FormuleVisiteur;

public interface Formule {
    void accept(FormuleVisiteur formuleVisiteur);
}
