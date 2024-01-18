CREATE TABLE sexe (
	id SERIAL PRIMARY KEY,
	nom text not null
);

CREATE TABLE personne (
	id SERIAL PRIMARY KEY,
	nom TEXT NOT NULL,
	prenom TEXT NOT NULL,
	date_naissance DATE NOT NULL,
	address text,
	id_sexe int references sexe(id) NOT NULL
);

CREATE TABLE consultation (
	id SERIAL PRIMARY KEY,
	date_consul DATE NOT NULL,
	poids DECIMAL NOT NULL,
	id_personne INT REFERENCES personne(id) NOT NULL
);

CREATE TABLE symptomes (
	id SERIAL PRIMARY KEY,
	nom text not null
);

CREATE TABLE consultation_symptome (
	id SERIAL PRIMARY KEY,
	id_symptome int REFERENCES symptomes(id) NOT NULL,
	id_consultation int REFERENCES consultation(id) NOT NULL,
	degree int not null
);

CREATE TABLE maladie(
	id SERIAL PRIMARY KEY,
	nom TEXT NOT NULL
);

CREATE TABLE maladie_symptome(
	id SERIAL PRIMARY KEY,
	id_symptome int REFERENCES symptomes(id) NOT NULL,
	id_maladie int REFERENCES maladie(id) NOT NULL,
	degree int not null
);

CREATE TABLE classe_medicament(
	id SERIAL PRIMARY KEY,
	nom TEXT NOT NULL
);

CREATE TABLE type_medicament(
	id SERIAL PRIMARY KEY,
	nom TEXT NOT NULL
);

CREATE TABLE method_appl_medicament(
	id SERIAL PRIMARY KEY,
	nom TEXT NOT NULL
);

CREATE TABLE peusologie(
	id SERIAL PRIMARY KEY,
	nom TEXT NOT NULL
);

CREATE TABLE medicament(
	id SERIAL PRIMARY KEY,
	nom TEXT NOT NULL,
	id_pseulogie INT REFERENCES peusologie(id),
	id_classe INT REFERENCES classe_medicament(id),
	id_type INT REFERENCES type_medicament(id),
	id_methode INT REFERENCES method_appl_medicament(id),
	prix_unitaire INT NOT NULL
);

CREATE TABLE symptome_medicament(
	id SERIAL PRIMARY KEY,
	id_medicament INT REFERENCES medicament(id) NOT NULL,
	id_symptome INT REFERENCES symptomes(id) NOT NULL,
	efficacite INT NOT NULL
);

CREATE TABLE maladie_medicament(
	id SERIAL PRIMARY KEY,
	id_medicament INT REFERENCES medicament(id) NOT NULL,
	id_maladie INT REFERENCES maladie(id) NOT NULL,
	efficacite INT NOT NULL
);

CREATE TABLE contre_indication(
	id SERIAL PRIMARY KEY,
	medicament_1 INT REFERENCES medicament(id) NOT NULL,
	medicament_2 INT REFERENCES medicament(id) NOT NULL
);

CREATE TABLE personne_alergies(
	id SERIAL PRIMARY KEY,
	id_personne INT REFERENCES personne(id) NOT NULL,
	id_medicament INT REFERENCES medicament(id) NOT NULL
);

CREATE TABLE effet_secondaire_medicament(
	id SERIAL PRIMARY KEY,
	id_symptome INT REFERENCES symptomes(id) NOT NULL,
	id_medicament INT REFERENCES medicament(id) NOT NULL,
	degree INT NOT NULL
);
