package mg.tonymushah.itu.marary.inputs.records;

import java.util.Optional;

import mg.tonymushah.itu.marary.entities.complex.Medicament;

public record MedicamentRecord(String nom, Optional<Integer> idPeusologie, Optional<Integer> idClasse,
        Optional<Integer> idType,
        Optional<Integer> idMethode, int prixUnitaire) {
    public Medicament into() {
        return new Medicament(nom, idPeusologie, idClasse, idType, idMethode, prixUnitaire);
    }
}
