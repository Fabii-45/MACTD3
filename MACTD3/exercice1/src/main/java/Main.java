public class Main {
    public static void main(String[] args) {

        PersonneImpl personne1 = new PersonneImpl("Jean");

        personne1.manger();
        personne1.respirer();

        PersonneMasque personne1avecMasque = new PersonneMasque(new PersonneImpl("Jean"));

        personne1avecMasque.manger();
        personne1avecMasque.respirer();
        personne1avecMasque.sortir();
    }
}
