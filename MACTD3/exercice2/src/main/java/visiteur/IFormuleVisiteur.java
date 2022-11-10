package visiteur;

import visité.*;

public interface IFormuleVisiteur {

    void visit(Vrai v);
    void visit(Faux f);
    void visit(Inconnu i);
    void visit(Et et);
    void visit(Non non);

}
