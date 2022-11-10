package visiteur;

import visité.*;

public class FormuleVisiteur implements IFormuleVisiteur{

    public enum ValeurLogique{
        VRAI,
        FAUX,
        INCONNU
    }

    private ValeurLogique valeurLogique = ValeurLogique.INCONNU;

    public ValeurLogique getValeurLogique() {
        return valeurLogique;
    }

    public void setValeurLogique(ValeurLogique valeurLogique) {
        this.valeurLogique = valeurLogique;
    }

    @Override
    public void visit(Vrai v) {

    }

    @Override
    public void visit(Faux f) {

    }

    @Override
    public void visit(Inconnu i) {

    }

    @Override
    public void visit(Et et) {

    }

    @Override
    public void visit(Non non) {

    }
}
