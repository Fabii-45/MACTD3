public class PersonneMasque extends DecorateurPersonne {

    boolean possedeMasque = true;


    public PersonneMasque(PersonneImpl personne) {
        super(personne);
    }

    @Override
    public void manger() {
        super.manger();
        System.out.println(" mais c'est difficile avec ce masque !");
    }

    @Override
    public void respirer() {
        super.respirer();
        System.out.println(" mais c'est difficile avec ce masque !");
    }

    public void sortir() {
        System.out.println("Je peux sortir librement ! ");
    }

    @Override
    public String toString() {
        return super.toString()+" avec un masque qui me permet de sortir !";
    }
}
