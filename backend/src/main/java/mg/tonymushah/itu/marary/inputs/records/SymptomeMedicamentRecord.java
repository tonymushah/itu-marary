package mg.tonymushah.itu.marary.inputs.records;

import mg.tonymushah.itu.marary.entities.complex.SymptomeMedicament;

public record SymptomeMedicamentRecord(int idMedicament, int idSymptome, int efficacite) {
    public SymptomeMedicament into() {
        return new SymptomeMedicament(idMedicament, idSymptome, efficacite);
    }
}
