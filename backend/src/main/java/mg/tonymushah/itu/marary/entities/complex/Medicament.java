package mg.tonymushah.itu.marary.entities.complex;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.Optional;
import mg.tonymushah.itu.marary.entities.abstracts.EntityWithIDAndNom;
import mg.tonymushah.itu.marary.entities.mono.medicaments.ClasseMedicament;
import mg.tonymushah.itu.marary.entities.mono.medicaments.MethodeApplication;
import mg.tonymushah.itu.marary.entities.mono.medicaments.Peusologie;
import mg.tonymushah.itu.marary.entities.mono.medicaments.TypeMedicament;
import mg.tonymushah.itu.marary.repositories.mono.medicaments.ClasseMedicamentRepository;
import mg.tonymushah.itu.marary.repositories.mono.medicaments.MethodeApplicationRepository;
import mg.tonymushah.itu.marary.repositories.mono.medicaments.PeusologieRepository;
import mg.tonymushah.itu.marary.repositories.mono.medicaments.TypeMedicamentRepository;

@Entity
@Table(name = "medicament")
public class Medicament extends EntityWithIDAndNom {
    @Column(name = "id_pseulogie")
    private Optional<Integer> idPeusologie = Optional.empty();
    @Column(name = "id_classe")
    private Optional<Integer> idClasse = Optional.empty();
    @Column(name = "id_type")
    private Optional<Integer> idType = Optional.empty();
    @Column(name = "id_methode")
    private Optional<Integer> idMethode = Optional.empty();
    @Column(name = "prix_unitaire")
    private int prixUnitaire;

    public Optional<Integer> getIdPeusologie() {
        return idPeusologie;
    }

    public void setIdPeusologie(Optional<Integer> idPeusologie) {
        this.idPeusologie = idPeusologie;
    }

    public Optional<Integer> getIdClasse() {
        return idClasse;
    }

    public void setIdClasse(Optional<Integer> idClasse) {
        this.idClasse = idClasse;
    }

    public Optional<Integer> getIdType() {
        return idType;
    }

    public void setIdType(Optional<Integer> idType) {
        this.idType = idType;
    }

    public Optional<Integer> getIdMethode() {
        return idMethode;
    }

    public void setIdMethode(Optional<Integer> idMethode) {
        this.idMethode = idMethode;
    }

    public int getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(int prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public Medicament() {
    }

    public Medicament(int id, String nom, Optional<Integer> idPeusologie, Optional<Integer> idClasse,
            Optional<Integer> idType, Optional<Integer> idMethode, int prixUnitaire) {
        super(id, nom);
        this.setIdClasse(idClasse);
        this.setIdMethode(idMethode);
        this.setIdPeusologie(idPeusologie);
        this.setIdType(idType);
        this.setPrixUnitaire(prixUnitaire);
    }

    public Medicament(String nom, Optional<Integer> idPeusologie, Optional<Integer> idClasse, Optional<Integer> idType,
            Optional<Integer> idMethode, int prixUnitaire) {
        super(nom);
        this.setIdClasse(idClasse);
        this.setIdMethode(idMethode);
        this.setIdPeusologie(idPeusologie);
        this.setIdType(idType);
        this.setPrixUnitaire(prixUnitaire);
    }

    public Optional<Peusologie> getPeusologie(PeusologieRepository repository) {
        return this.getIdPeusologie().flatMap(id -> repository.findById(id));
    }

    public Optional<ClasseMedicament> getClasseMedicament(ClasseMedicamentRepository repository) {
        return this.getIdClasse().flatMap(id -> repository.findById(id));
    }

    public Optional<TypeMedicament> getTypeMedicament(TypeMedicamentRepository repository) {
        return this.getIdType().flatMap(id -> repository.findById(id));
    }

    public Optional<MethodeApplication> getApplicationMethode(MethodeApplicationRepository repository) {
        return this.getIdMethode().flatMap(id -> repository.findById(id));
    }
}
