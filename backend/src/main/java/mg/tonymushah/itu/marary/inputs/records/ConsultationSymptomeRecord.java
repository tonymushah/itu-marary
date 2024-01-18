package mg.tonymushah.itu.marary.inputs.records;

import mg.tonymushah.itu.marary.entities.complex.ConsultationSymptome;

public record ConsultationSymptomeRecord(int idSymptome, int idConsultation, int degree) {
    public ConsultationSymptome into() {
        return new ConsultationSymptome(idSymptome, idConsultation, degree);
    }
}
