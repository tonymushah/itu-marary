package mg.tonymushah.itu.marary.inputs.records;

import mg.tonymushah.itu.marary.entities.complex.PersonneAlergie;

public record PersonneAlergieRecord(int idPersonne, int idMedicament) {
    public PersonneAlergie into() {
        return new PersonneAlergie(idPersonne, idMedicament);
    }
}
