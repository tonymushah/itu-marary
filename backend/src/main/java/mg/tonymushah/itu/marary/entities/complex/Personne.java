package mg.tonymushah.itu.marary.entities.complex;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.util.Date;
import java.util.Optional;
import mg.tonymushah.itu.marary.entities.abstracts.EntityWithIDAndNom;
import mg.tonymushah.itu.marary.entities.mono.Sexe;
import mg.tonymushah.itu.marary.repositories.mono.SexeRepository;

@Entity
@Table(name = "personne")
public class Personne extends EntityWithIDAndNom {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "personne_id_seq", sequenceName = "personne_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "personne_id_seq")
    private int id;
    @Column(name = "prenom", nullable = false)
    private String prenom;
    @Column(name = "date_naissance", nullable = false)
    private Date date_naissance;
    @Column(name = "address")
    private String address;
    @Column(name = "id_sexe", nullable = false)
    private int id_sexe;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public Optional<String> getAddress() {
        return Optional.ofNullable(address);
    }

    public void setAddress(Optional<String> address) {
        this.address = address.orElse(null);
    }

    public int getId_sexe() {
        return id_sexe;
    }

    public void setId_sexe(int id_sexe) {
        this.id_sexe = id_sexe;
    }

    public Optional<Sexe> getSexe(SexeRepository repository) {
        return repository.findById(this.getId_sexe());
    }

    public Personne() {
    }

    public Personne(String nom, String prenom, Date date_naissance, Optional<String> address, int id_sexe) {
        super(nom);
        this.setPrenom(prenom);
        this.setDate_naissance(date_naissance);
        this.setAddress(address);
        this.setId_sexe(id_sexe);
    }

    public Personne(int id, String nom, String prenom, Date date_naissance, Optional<String> address, int id_sexe) {
        super(id, nom);
        this.setPrenom(prenom);
        this.setDate_naissance(date_naissance);
        this.setAddress(address);
        this.setId_sexe(id_sexe);
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
