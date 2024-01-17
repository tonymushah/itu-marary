package mg.tonymushah.itu.marary.entities.complex;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "medicament_id_seq")
    private int id;
    @Column(name = "id_pseulogie")
    private Integer idPeusologie = null;
    @Column(name = "id_classe")
    private Integer idClasse = null;
    @Column(name = "id_type")
    private Integer idType = null;
    @Column(name = "id_methode")
    private Integer idMethode = null;
    @Column(name = "prix_unitaire", nullable = false)
    private int prixUnitaire;

    public Optional<Integer> getIdPeusologie() {
        return Optional.ofNullable(idPeusologie);
    }

    public void setIdPeusologie(Optional<Integer> idPeusologie) {
        this.idPeusologie = idPeusologie.orElse(null);
    }

    public Optional<Integer> getIdClasse() {
        return Optional.ofNullable(idClasse);
    }

    public void setIdClasse(Optional<Integer> idClasse) {
        this.idClasse = idClasse.orElse(null);
    }

    public Optional<Integer> getIdType() {
        return Optional.ofNullable(idType);
    }

    public void setIdType(Optional<Integer> idType) {
        this.idType = idType.orElse(null);
    }

    public Optional<Integer> getIdMethode() {
        return Optional.ofNullable(idMethode);
    }

    public void setIdMethode(Optional<Integer> idMethode) {
        this.idMethode = idMethode.orElse(null);
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

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

}
