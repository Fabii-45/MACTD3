package visité;

import visiteur.FormuleVisiteur;

public class Non implements Formule{

    private Formule formule;
    public Non(Formule formule){

    }

    public Formule getFormule() {
        return formule;
    }

    public void setFormule(Formule formule) {
        this.formule = formule;
    }

    @Override
    public void accept(FormuleVisiteur formuleVisiteur) {
        formuleVisiteur.visit(this);
    }
}
