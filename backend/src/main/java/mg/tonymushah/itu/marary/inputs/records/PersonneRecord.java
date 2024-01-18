package mg.tonymushah.itu.marary.inputs.records;

import java.util.Optional;

import mg.tonymushah.itu.marary.entities.complex.Personne;

import java.util.Date;

public record PersonneRecord(String nom, String prenom, Date date_naissance, Optional<String> address, int id_sexe) {
    public Personne into() {
        return new Personne(nom, prenom, date_naissance, address, id_sexe);
    }
}
