package visiteur;

import visité.Chiffre;
import visité.Moins;
import visité.Multiplie;
import visité.Plus;

public interface CalculVisiteur {

    int visit(Chiffre chiffre);

    int visit(Moins moins);

    int visit(Plus plus);

    int visit(Multiplie multiplie);
}
