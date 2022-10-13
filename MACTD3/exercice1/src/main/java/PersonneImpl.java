public class PersonneImpl implements Personne{

    private String nom;

    public PersonneImpl(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void manger() {
        System.out.println("Je mange");
    }

    public void respirer() {
        System.out.println("Je respire");
    }

    @Override
    public String toString() {
        return "Je suis une personne";
    }
}
