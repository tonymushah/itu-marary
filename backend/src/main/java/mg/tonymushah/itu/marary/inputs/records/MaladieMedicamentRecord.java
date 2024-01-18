package mg.tonymushah.itu.marary.inputs.records;

import mg.tonymushah.itu.marary.entities.complex.MaladieMedicament;

public record MaladieMedicamentRecord(int idMedicament, int idMaladie, int efficacite) {
    public MaladieMedicament into() {
        return new MaladieMedicament(idMedicament, idMaladie, efficacite);
    }
}
