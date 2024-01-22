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

import {
	ClasseMedicament,
	ContreIndication,
	ContreIndicationRecord,
	EffetSecondaireMedicament,
	EffetSecondaireMedicamentRecord,
	MaladieMedicament,
	MaladieMedicamentRecord,
	Medicament,
	MedicamentRecord,
	MethodeApplication,
	OnlyNomRecord,
	PageClasseMedicament,
	PageMethodeApplication,
	PagePeusologie,
	PageTypeMedicament,
	Peusologie,
	TypeMedicament
} from './data-contracts';
import { ContentType, HttpClient, RequestParams } from './http-client';

export class Medicament<SecurityDataType = unknown> extends HttpClient<SecurityDataType> {
	/**
	 * No description
	 *
	 * @tags medicament-controller
	 * @name GetUnique5
	 * @request GET:/medicament/{id}
	 */
	getUnique5 = (id: number, params: RequestParams = {}) =>
		this.request<Medicament, any>({
			path: `/medicament/${id}`,
			method: 'GET',
			...params
		});
	/**
	 * No description
	 *
	 * @tags medicament-controller
	 * @name Update5
	 * @request PUT:/medicament/{id}
	 */
	update5 = (id: number, data: MedicamentRecord, params: RequestParams = {}) =>
		this.request<Medicament, any>({
			path: `/medicament/${id}`,
			method: 'PUT',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags medicament-controller
	 * @name Delete5
	 * @request DELETE:/medicament/{id}
	 */
	delete5 = (id: number, params: RequestParams = {}) =>
		this.request<Medicament, any>({
			path: `/medicament/${id}`,
			method: 'DELETE',
			...params
		});
	/**
	 * No description
	 *
	 * @tags type-medicament-controller
	 * @name GetUnique6
	 * @request GET:/medicament/type/{id}
	 */
	getUnique6 = (id: number, params: RequestParams = {}) =>
		this.request<TypeMedicament, any>({
			path: `/medicament/type/${id}`,
			method: 'GET',
			...params
		});
	/**
	 * No description
	 *
	 * @tags type-medicament-controller
	 * @name Update6
	 * @request PUT:/medicament/type/{id}
	 */
	update6 = (id: number, data: OnlyNomRecord, params: RequestParams = {}) =>
		this.request<TypeMedicament, any>({
			path: `/medicament/type/${id}`,
			method: 'PUT',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags type-medicament-controller
	 * @name Delete6
	 * @request DELETE:/medicament/type/{id}
	 */
	delete6 = (id: number, params: RequestParams = {}) =>
		this.request<TypeMedicament, any>({
			path: `/medicament/type/${id}`,
			method: 'DELETE',
			...params
		});
	/**
	 * No description
	 *
	 * @tags peusologie-controller
	 * @name GetUnique7
	 * @request GET:/medicament/peusologie/{id}
	 */
	getUnique7 = (id: number, params: RequestParams = {}) =>
		this.request<Peusologie, any>({
			path: `/medicament/peusologie/${id}`,
			method: 'GET',
			...params
		});
	/**
	 * No description
	 *
	 * @tags peusologie-controller
	 * @name Update7
	 * @request PUT:/medicament/peusologie/{id}
	 */
	update7 = (id: number, data: OnlyNomRecord, params: RequestParams = {}) =>
		this.request<Peusologie, any>({
			path: `/medicament/peusologie/${id}`,
			method: 'PUT',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags peusologie-controller
	 * @name Delete7
	 * @request DELETE:/medicament/peusologie/{id}
	 */
	delete7 = (id: number, params: RequestParams = {}) =>
		this.request<Peusologie, any>({
			path: `/medicament/peusologie/${id}`,
			method: 'DELETE',
			...params
		});
	/**
	 * No description
	 *
	 * @tags methode-application-controller
	 * @name GetUnique8
	 * @request GET:/medicament/methode-application/{id}
	 */
	getUnique8 = (id: number, params: RequestParams = {}) =>
		this.request<MethodeApplication, any>({
			path: `/medicament/methode-application/${id}`,
			method: 'GET',
			...params
		});
	/**
	 * No description
	 *
	 * @tags methode-application-controller
	 * @name Update8
	 * @request PUT:/medicament/methode-application/{id}
	 */
	update8 = (id: number, data: OnlyNomRecord, params: RequestParams = {}) =>
		this.request<MethodeApplication, any>({
			path: `/medicament/methode-application/${id}`,
			method: 'PUT',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags methode-application-controller
	 * @name Delete8
	 * @request DELETE:/medicament/methode-application/{id}
	 */
	delete8 = (id: number, params: RequestParams = {}) =>
		this.request<MethodeApplication, any>({
			path: `/medicament/methode-application/${id}`,
			method: 'DELETE',
			...params
		});
	/**
	 * No description
	 *
	 * @tags maladie-medicament-controller
	 * @name GetUnique9
	 * @request GET:/medicament/maladie/{id}
	 */
	getUnique9 = (id: number, params: RequestParams = {}) =>
		this.request<MaladieMedicament, any>({
			path: `/medicament/maladie/${id}`,
			method: 'GET',
			...params
		});
	/**
	 * No description
	 *
	 * @tags maladie-medicament-controller
	 * @name Update9
	 * @request PUT:/medicament/maladie/{id}
	 */
	update9 = (id: number, data: MaladieMedicamentRecord, params: RequestParams = {}) =>
		this.request<MaladieMedicament, any>({
			path: `/medicament/maladie/${id}`,
			method: 'PUT',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags maladie-medicament-controller
	 * @name Delete9
	 * @request DELETE:/medicament/maladie/{id}
	 */
	delete9 = (id: number, params: RequestParams = {}) =>
		this.request<MaladieMedicament, any>({
			path: `/medicament/maladie/${id}`,
			method: 'DELETE',
			...params
		});
	/**
	 * No description
	 *
	 * @tags effet-secondaire-medicament-controller
	 * @name GetUnique10
	 * @request GET:/medicament/effet-secondaire/{id}
	 */
	getUnique10 = (id: number, params: RequestParams = {}) =>
		this.request<EffetSecondaireMedicament, any>({
			path: `/medicament/effet-secondaire/${id}`,
			method: 'GET',
			...params
		});
	/**
	 * No description
	 *
	 * @tags effet-secondaire-medicament-controller
	 * @name Update10
	 * @request PUT:/medicament/effet-secondaire/{id}
	 */
	update10 = (id: number, data: EffetSecondaireMedicamentRecord, params: RequestParams = {}) =>
		this.request<EffetSecondaireMedicament, any>({
			path: `/medicament/effet-secondaire/${id}`,
			method: 'PUT',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags effet-secondaire-medicament-controller
	 * @name Delete10
	 * @request DELETE:/medicament/effet-secondaire/{id}
	 */
	delete10 = (id: number, params: RequestParams = {}) =>
		this.request<EffetSecondaireMedicament, any>({
			path: `/medicament/effet-secondaire/${id}`,
			method: 'DELETE',
			...params
		});
	/**
	 * No description
	 *
	 * @tags contre-indication-controller
	 * @name GetUnique11
	 * @request GET:/medicament/contre-indication/{id}
	 */
	getUnique11 = (id: number, params: RequestParams = {}) =>
		this.request<ContreIndication, any>({
			path: `/medicament/contre-indication/${id}`,
			method: 'GET',
			...params
		});
	/**
	 * No description
	 *
	 * @tags contre-indication-controller
	 * @name Update11
	 * @request PUT:/medicament/contre-indication/{id}
	 */
	update11 = (id: number, data: ContreIndicationRecord, params: RequestParams = {}) =>
		this.request<ContreIndication, any>({
			path: `/medicament/contre-indication/${id}`,
			method: 'PUT',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags contre-indication-controller
	 * @name Delete11
	 * @request DELETE:/medicament/contre-indication/{id}
	 */
	delete11 = (id: number, params: RequestParams = {}) =>
		this.request<ContreIndication, any>({
			path: `/medicament/contre-indication/${id}`,
			method: 'DELETE',
			...params
		});
	/**
	 * No description
	 *
	 * @tags classe-medicament-controller
	 * @name GetUnique12
	 * @request GET:/medicament/classe/{id}
	 */
	getUnique12 = (id: number, params: RequestParams = {}) =>
		this.request<ClasseMedicament, any>({
			path: `/medicament/classe/${id}`,
			method: 'GET',
			...params
		});
	/**
	 * No description
	 *
	 * @tags classe-medicament-controller
	 * @name Update12
	 * @request PUT:/medicament/classe/{id}
	 */
	update12 = (id: number, data: OnlyNomRecord, params: RequestParams = {}) =>
		this.request<ClasseMedicament, any>({
			path: `/medicament/classe/${id}`,
			method: 'PUT',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags classe-medicament-controller
	 * @name Delete12
	 * @request DELETE:/medicament/classe/{id}
	 */
	delete12 = (id: number, params: RequestParams = {}) =>
		this.request<ClasseMedicament, any>({
			path: `/medicament/classe/${id}`,
			method: 'DELETE',
			...params
		});
	/**
	 * No description
	 *
	 * @tags medicament-controller
	 * @name Create5
	 * @request POST:/medicament
	 */
	create5 = (data: MedicamentRecord, params: RequestParams = {}) =>
		this.request<Medicament, any>({
			path: `/medicament`,
			method: 'POST',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags type-medicament-controller
	 * @name Get2
	 * @request GET:/medicament/type
	 */
	get2 = (
		query?: {
			/**
			 * @format int32
			 * @default 0
			 */
			offset?: number;
			/**
			 * @format int32
			 * @default 10
			 */
			limit?: number;
			/** @default "" */
			nom?: string;
		},
		params: RequestParams = {}
	) =>
		this.request<PageTypeMedicament, any>({
			path: `/medicament/type`,
			method: 'GET',
			query: query,
			...params
		});
	/**
	 * No description
	 *
	 * @tags type-medicament-controller
	 * @name Create6
	 * @request POST:/medicament/type
	 */
	create6 = (data: OnlyNomRecord, params: RequestParams = {}) =>
		this.request<TypeMedicament, any>({
			path: `/medicament/type`,
			method: 'POST',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags peusologie-controller
	 * @name Get3
	 * @request GET:/medicament/peusologie
	 */
	get3 = (
		query?: {
			/**
			 * @format int32
			 * @default 0
			 */
			offset?: number;
			/**
			 * @format int32
			 * @default 10
			 */
			limit?: number;
			/** @default "" */
			nom?: string;
		},
		params: RequestParams = {}
	) =>
		this.request<PagePeusologie, any>({
			path: `/medicament/peusologie`,
			method: 'GET',
			query: query,
			...params
		});
	/**
	 * No description
	 *
	 * @tags peusologie-controller
	 * @name Create7
	 * @request POST:/medicament/peusologie
	 */
	create7 = (data: OnlyNomRecord, params: RequestParams = {}) =>
		this.request<Peusologie, any>({
			path: `/medicament/peusologie`,
			method: 'POST',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags methode-application-controller
	 * @name Get4
	 * @request GET:/medicament/methode-application
	 */
	get4 = (
		query?: {
			/**
			 * @format int32
			 * @default 0
			 */
			offset?: number;
			/**
			 * @format int32
			 * @default 10
			 */
			limit?: number;
			/** @default "" */
			nom?: string;
		},
		params: RequestParams = {}
	) =>
		this.request<PageMethodeApplication, any>({
			path: `/medicament/methode-application`,
			method: 'GET',
			query: query,
			...params
		});
	/**
	 * No description
	 *
	 * @tags methode-application-controller
	 * @name Create8
	 * @request POST:/medicament/methode-application
	 */
	create8 = (data: OnlyNomRecord, params: RequestParams = {}) =>
		this.request<MethodeApplication, any>({
			path: `/medicament/methode-application`,
			method: 'POST',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags maladie-medicament-controller
	 * @name Create9
	 * @request POST:/medicament/maladie
	 */
	create9 = (data: MaladieMedicamentRecord, params: RequestParams = {}) =>
		this.request<MaladieMedicament, any>({
			path: `/medicament/maladie`,
			method: 'POST',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags effet-secondaire-medicament-controller
	 * @name Create10
	 * @request POST:/medicament/effet-secondaire
	 */
	create10 = (data: EffetSecondaireMedicamentRecord, params: RequestParams = {}) =>
		this.request<EffetSecondaireMedicament, any>({
			path: `/medicament/effet-secondaire`,
			method: 'POST',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags contre-indication-controller
	 * @name Create11
	 * @request POST:/medicament/contre-indication
	 */
	create11 = (data: ContreIndicationRecord, params: RequestParams = {}) =>
		this.request<ContreIndication, any>({
			path: `/medicament/contre-indication`,
			method: 'POST',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags classe-medicament-controller
	 * @name Get5
	 * @request GET:/medicament/classe
	 */
	get5 = (
		query?: {
			/**
			 * @format int32
			 * @default 0
			 */
			offset?: number;
			/**
			 * @format int32
			 * @default 10
			 */
			limit?: number;
			/** @default "" */
			nom?: string;
		},
		params: RequestParams = {}
	) =>
		this.request<PageClasseMedicament, any>({
			path: `/medicament/classe`,
			method: 'GET',
			query: query,
			...params
		});
	/**
	 * No description
	 *
	 * @tags classe-medicament-controller
	 * @name Create12
	 * @request POST:/medicament/classe
	 */
	create12 = (data: OnlyNomRecord, params: RequestParams = {}) =>
		this.request<ClasseMedicament, any>({
			path: `/medicament/classe`,
			method: 'POST',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags type-medicament-controller
	 * @name GetAll5
	 * @request GET:/medicament/type/all
	 */
	getAll5 = (
		query?: {
			ids?: number[];
		},
		params: RequestParams = {}
	) =>
		this.request<object, any>({
			path: `/medicament/type/all`,
			method: 'GET',
			query: query,
			...params
		});
	/**
	 * No description
	 *
	 * @tags peusologie-controller
	 * @name GetAll6
	 * @request GET:/medicament/peusologie/all
	 */
	getAll6 = (
		query?: {
			ids?: number[];
		},
		params: RequestParams = {}
	) =>
		this.request<object, any>({
			path: `/medicament/peusologie/all`,
			method: 'GET',
			query: query,
			...params
		});
	/**
	 * No description
	 *
	 * @tags methode-application-controller
	 * @name GetAll7
	 * @request GET:/medicament/methode-application/all
	 */
	getAll7 = (
		query?: {
			ids?: number[];
		},
		params: RequestParams = {}
	) =>
		this.request<object, any>({
			path: `/medicament/methode-application/all`,
			method: 'GET',
			query: query,
			...params
		});
	/**
	 * No description
	 *
	 * @tags maladie-medicament-controller
	 * @name GetAll8
	 * @request GET:/medicament/maladie/all
	 */
	getAll8 = (
		query?: {
			ids?: number[];
		},
		params: RequestParams = {}
	) =>
		this.request<object, any>({
			path: `/medicament/maladie/all`,
			method: 'GET',
			query: query,
			...params
		});
	/**
	 * No description
	 *
	 * @tags effet-secondaire-medicament-controller
	 * @name GetAll9
	 * @request GET:/medicament/effet-secondaire/all
	 */
	getAll9 = (
		query?: {
			ids?: number[];
		},
		params: RequestParams = {}
	) =>
		this.request<object, any>({
			path: `/medicament/effet-secondaire/all`,
			method: 'GET',
			query: query,
			...params
		});
	/**
	 * No description
	 *
	 * @tags contre-indication-controller
	 * @name GetAll10
	 * @request GET:/medicament/contre-indication/all
	 */
	getAll10 = (
		query?: {
			ids?: number[];
		},
		params: RequestParams = {}
	) =>
		this.request<object, any>({
			path: `/medicament/contre-indication/all`,
			method: 'GET',
			query: query,
			...params
		});
	/**
	 * No description
	 *
	 * @tags classe-medicament-controller
	 * @name GetAll11
	 * @request GET:/medicament/classe/all
	 */
	getAll11 = (
		query?: {
			ids?: number[];
		},
		params: RequestParams = {}
	) =>
		this.request<object, any>({
			path: `/medicament/classe/all`,
			method: 'GET',
			query: query,
			...params
		});
	/**
	 * No description
	 *
	 * @tags medicament-controller
	 * @name GetAll12
	 * @request GET:/medicament/all
	 */
	getAll12 = (
		query?: {
			ids?: number[];
		},
		params: RequestParams = {}
	) =>
		this.request<object, any>({
			path: `/medicament/all`,
			method: 'GET',
			query: query,
			...params
		});
}
