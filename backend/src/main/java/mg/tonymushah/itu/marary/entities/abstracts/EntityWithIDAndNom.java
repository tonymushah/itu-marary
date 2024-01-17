package mg.tonymushah.itu.marary.entities.abstracts;

import jakarta.persistence.Column;

/**
 * EntityWithIDAndName
 */
public abstract class EntityWithIDAndNom extends EntityWithID {

    @Column(name = "nom", nullable = false)
    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public EntityWithIDAndNom() {
    }

    public EntityWithIDAndNom(int id) {
        super(id);
    }

    public EntityWithIDAndNom(int id, String nom) {
        super(id);
        this.setNom(nom);
    }

    public EntityWithIDAndNom(String nom) {
        this.setNom(nom);
    }

}