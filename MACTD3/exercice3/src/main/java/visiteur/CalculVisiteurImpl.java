package visiteur;

import visité.Chiffre;
import visité.Moins;
import visité.Multiplie;
import visité.Plus;

public class CalculVisiteurImpl implements CalculVisiteur{

    @Override
    public int visit(Chiffre chiffre) {
        System.out.println("Visiting" + chiffre);
        return Integer.parseInt(chiffre.toString());
    }

    @Override
    public int visit(Moins moins) {
        System.out.println("Visiting" + moins.getCalculGauche().toString() + " - " + moins.getCalculDroite().toString());
        return Integer.parseInt(moins.getCalculGauche().toString())-Integer.parseInt(moins.getCalculDroite().toString());
    }

    @Override
    public int visit(Plus plus) {
        System.out.println("Visiting" + plus.getCalculGauche().toString() + " + " + plus.getCalculDroite().toString());
        return Integer.parseInt(plus.getCalculGauche().toString())+Integer.parseInt(plus.getCalculDroite().toString());
    }

    @Override
    public int visit(Multiplie multiplie) {
        System.out.println("Visiting" + multiplie.getCalculGauche().toString() + " * " + multiplie.getCalculDroite().toString());
        return Integer.parseInt(multiplie.getCalculGauche().toString())*Integer.parseInt(multiplie.getCalculDroite().toString());
    }
}
