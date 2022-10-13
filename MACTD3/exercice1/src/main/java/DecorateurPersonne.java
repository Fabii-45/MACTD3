abstract class DecorateurPersonne extends PersonneImpl{

    PersonneImpl personne;

    public DecorateurPersonne(PersonneImpl personne) {
        super(personne.getNom());
    }
}
