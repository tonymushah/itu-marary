package mg.tonymushah.itu.marary.inputs.records;

import mg.tonymushah.itu.marary.entities.complex.MaladieSymptome;

public record MaladieSymptomeRecord(int idSymptome, int idMaladie, int degree) {
    public MaladieSymptome into() {
        return new MaladieSymptome(idSymptome, idMaladie, degree);
    }
}
