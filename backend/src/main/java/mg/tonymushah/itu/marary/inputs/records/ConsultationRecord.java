package mg.tonymushah.itu.marary.inputs.records;

import java.util.Date;

import mg.tonymushah.itu.marary.entities.complex.Consultation;

public record ConsultationRecord(
        Date date,
        float poids,
        int idPersonne) {
    public Consultation into() {
        return new Consultation(date, poids, idPersonne);
    }
}
