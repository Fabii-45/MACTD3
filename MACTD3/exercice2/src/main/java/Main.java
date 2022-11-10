import visiteur.IFormuleVisiteur;
import visiteur.FormuleVisiteur;
import visité.*;

public class Main {
    public static void main(String[] args) {

        Formule formule = new Non(new Et(new Vrai(), new Non(new Inconnu())));
        //FormuleVisiteur evaluateur = new Afficheurpourafficherleresultat();
        //formule.accept(evaluateur);
        //System.out.println(evaluateur.getResultat());


    }

}
