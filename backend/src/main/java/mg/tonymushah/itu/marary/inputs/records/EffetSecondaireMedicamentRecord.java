package mg.tonymushah.itu.marary.inputs.records;

import mg.tonymushah.itu.marary.entities.complex.EffetSecondaireMedicament;

public record EffetSecondaireMedicamentRecord(int idMedicament, int idSymptome, int degree) {
    public EffetSecondaireMedicament into() {
        return new EffetSecondaireMedicament(idMedicament, idSymptome, degree);
    }
}
