package mg.tonymushah.itu.marary.inputs.abstracts;

public abstract class OnlyNomAbstractInput {
    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public OnlyNomAbstractInput() {
    }

    public OnlyNomAbstractInput(String nom) {
        this.setNom(nom);
    }

}
