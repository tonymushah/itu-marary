package mg.tonymushah.itu.marary.inputs.records;

import mg.tonymushah.itu.marary.entities.complex.ContreIndication;

public record ContreIndicationRecord(int idMedicament1, int idMedicament2) {
    public ContreIndication into() {
        return new ContreIndication(idMedicament1, idMedicament2);
    }
}
