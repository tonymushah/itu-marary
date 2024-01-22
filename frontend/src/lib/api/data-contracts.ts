/* eslint-disable */
/* tslint:disable */
/*
 * ---------------------------------------------------------------
 * ## THIS FILE WAS GENERATED VIA SWAGGER-TYPESCRIPT-API        ##
 * ##                                                           ##
 * ## AUTHOR: acacode                                           ##
 * ## SOURCE: https://github.com/acacode/swagger-typescript-api ##
 * ---------------------------------------------------------------
 */

export interface OnlyNomRecord {
	nom?: string;
}

export interface Symptome {
	nom?: string;
	/** @format int32 */
	id?: number;
}

export interface SymptomeMedicamentRecord {
	/** @format int32 */
	idMedicament?: number;
	/** @format int32 */
	idSymptome?: number;
	/** @format int32 */
	efficacite?: number;
}

export interface SymptomeMedicament {
	/** @format int32 */
	id?: number;
	/** @format int32 */
	idMedicament?: number;
	/** @format int32 */
	idSymptome?: number;
	/** @format int32 */
	efficacite?: number;
}

export interface Sexe {
	nom?: string;
	/** @format int32 */
	id?: number;
}

export interface PersonneRecord {
	nom?: string;
	prenom?: string;
	/** @format date-time */
	date_naissance?: string;
	address?: string;
	/** @format int32 */
	id_sexe?: number;
}

export interface Personne {
	nom?: string;
	/** @format int32 */
	id?: number;
	prenom?: string;
	/** @format date-time */
	date_naissance?: string;
	address?: string;
	/** @format int32 */
	id_sexe?: number;
}

export interface PersonneAlergieRecord {
	/** @format int32 */
	idPersonne?: number;
	/** @format int32 */
	idMedicament?: number;
}

export interface PersonneAlergie {
	/** @format int32 */
	id?: number;
	/** @format int32 */
	idPersonne?: number;
	/** @format int32 */
	idMedicament?: number;
}

export interface MedicamentRecord {
	nom?: string;
	/** @format int32 */
	idPeusologie?: number;
	/** @format int32 */
	idClasse?: number;
	/** @format int32 */
	idType?: number;
	/** @format int32 */
	idMethode?: number;
	/** @format int32 */
	prixUnitaire?: number;
}

export interface Medicament {
	nom?: string;
	/** @format int32 */
	id?: number;
	/** @format int32 */
	idPeusologie?: number;
	/** @format int32 */
	idClasse?: number;
	/** @format int32 */
	idType?: number;
	/** @format int32 */
	idMethode?: number;
	/** @format int32 */
	prixUnitaire?: number;
}

export interface TypeMedicament {
	nom?: string;
	/** @format int32 */
	id?: number;
}

export interface Peusologie {
	nom?: string;
	/** @format int32 */
	id?: number;
}

export interface MethodeApplication {
	nom?: string;
	/** @format int32 */
	id?: number;
}

export interface MaladieMedicamentRecord {
	/** @format int32 */
	idMedicament?: number;
	/** @format int32 */
	idMaladie?: number;
	/** @format int32 */
	efficacite?: number;
}

export interface MaladieMedicament {
	/** @format int32 */
	id?: number;
	/** @format int32 */
	idMedicament?: number;
	/** @format int32 */
	idMaladie?: number;
	/** @format int32 */
	efficacite?: number;
}

export interface EffetSecondaireMedicamentRecord {
	/** @format int32 */
	idMedicament?: number;
	/** @format int32 */
	idSymptome?: number;
	/** @format int32 */
	degree?: number;
}

export interface EffetSecondaireMedicament {
	/** @format int32 */
	id?: number;
	/** @format int32 */
	idMedicament?: number;
	/** @format int32 */
	idSymptome?: number;
	/** @format int32 */
	degree?: number;
}

export interface ContreIndicationRecord {
	/** @format int32 */
	idMedicament1?: number;
	/** @format int32 */
	idMedicament2?: number;
}

export interface ContreIndication {
	/** @format int32 */
	id?: number;
	/** @format int32 */
	idMedicament1?: number;
	/** @format int32 */
	idMedicament2?: number;
}

export interface ClasseMedicament {
	nom?: string;
	/** @format int32 */
	id?: number;
}

export interface Maladie {
	nom?: string;
	/** @format int32 */
	id?: number;
}

export interface MaladieSymptomeRecord {
	/** @format int32 */
	idSymptome?: number;
	/** @format int32 */
	idMaladie?: number;
	/** @format int32 */
	degree?: number;
}

export interface MaladieSymptome {
	/** @format int32 */
	id?: number;
	/** @format int32 */
	idSymptome?: number;
	/** @format int32 */
	idMaladie?: number;
	/** @format int32 */
	degree?: number;
}

export interface ConsultationRecord {
	/** @format date-time */
	date?: string;
	/** @format float */
	poids?: number;
	/** @format int32 */
	idPersonne?: number;
}

export interface Consultation {
	/** @format int32 */
	id?: number;
	/** @format date-time */
	date?: string;
	/** @format float */
	poids?: number;
	/** @format int32 */
	idPersonne?: number;
}

export interface ConsultationSymptomeRecord {
	/** @format int32 */
	idSymptome?: number;
	/** @format int32 */
	idConsultation?: number;
	/** @format int32 */
	degree?: number;
}

export interface ConsultationSymptome {
	/** @format int32 */
	id?: number;
	/** @format int32 */
	idSymptome?: number;
	/** @format int32 */
	idConsultation?: number;
	/** @format int32 */
	degree?: number;
}

export interface PageSymptome {
	/** @format int32 */
	totalPages?: number;
	/** @format int64 */
	totalElements?: number;
	/** @format int32 */
	size?: number;
	content?: Symptome[];
	/** @format int32 */
	number?: number;
	sort?: SortObject;
	pageable?: PageableObject;
	/** @format int32 */
	numberOfElements?: number;
	first?: boolean;
	last?: boolean;
	empty?: boolean;
}

export interface PageableObject {
	/** @format int64 */
	offset?: number;
	sort?: SortObject;
	/** @format int32 */
	pageNumber?: number;
	/** @format int32 */
	pageSize?: number;
	paged?: boolean;
	unpaged?: boolean;
}

export interface SortObject {
	empty?: boolean;
	sorted?: boolean;
	unsorted?: boolean;
}

export interface PageSexe {
	/** @format int32 */
	totalPages?: number;
	/** @format int64 */
	totalElements?: number;
	/** @format int32 */
	size?: number;
	content?: Sexe[];
	/** @format int32 */
	number?: number;
	sort?: SortObject;
	pageable?: PageableObject;
	/** @format int32 */
	numberOfElements?: number;
	first?: boolean;
	last?: boolean;
	empty?: boolean;
}

export interface PageTypeMedicament {
	/** @format int32 */
	totalPages?: number;
	/** @format int64 */
	totalElements?: number;
	/** @format int32 */
	size?: number;
	content?: TypeMedicament[];
	/** @format int32 */
	number?: number;
	sort?: SortObject;
	pageable?: PageableObject;
	/** @format int32 */
	numberOfElements?: number;
	first?: boolean;
	last?: boolean;
	empty?: boolean;
}

export interface PagePeusologie {
	/** @format int32 */
	totalPages?: number;
	/** @format int64 */
	totalElements?: number;
	/** @format int32 */
	size?: number;
	content?: Peusologie[];
	/** @format int32 */
	number?: number;
	sort?: SortObject;
	pageable?: PageableObject;
	/** @format int32 */
	numberOfElements?: number;
	first?: boolean;
	last?: boolean;
	empty?: boolean;
}

export interface PageMethodeApplication {
	/** @format int32 */
	totalPages?: number;
	/** @format int64 */
	totalElements?: number;
	/** @format int32 */
	size?: number;
	content?: MethodeApplication[];
	/** @format int32 */
	number?: number;
	sort?: SortObject;
	pageable?: PageableObject;
	/** @format int32 */
	numberOfElements?: number;
	first?: boolean;
	last?: boolean;
	empty?: boolean;
}

export interface PageClasseMedicament {
	/** @format int32 */
	totalPages?: number;
	/** @format int64 */
	totalElements?: number;
	/** @format int32 */
	size?: number;
	content?: ClasseMedicament[];
	/** @format int32 */
	number?: number;
	sort?: SortObject;
	pageable?: PageableObject;
	/** @format int32 */
	numberOfElements?: number;
	first?: boolean;
	last?: boolean;
	empty?: boolean;
}

export interface PageMaladie {
	/** @format int32 */
	totalPages?: number;
	/** @format int64 */
	totalElements?: number;
	/** @format int32 */
	size?: number;
	content?: Maladie[];
	/** @format int32 */
	number?: number;
	sort?: SortObject;
	pageable?: PageableObject;
	/** @format int32 */
	numberOfElements?: number;
	first?: boolean;
	last?: boolean;
	empty?: boolean;
}

export interface PageConsultation {
	/** @format int32 */
	totalPages?: number;
	/** @format int64 */
	totalElements?: number;
	/** @format int32 */
	size?: number;
	content?: Consultation[];
	/** @format int32 */
	number?: number;
	sort?: SortObject;
	pageable?: PageableObject;
	/** @format int32 */
	numberOfElements?: number;
	first?: boolean;
	last?: boolean;
	empty?: boolean;
}
