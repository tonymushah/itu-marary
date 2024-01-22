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

import type {
	OnlyNomRecord,
	PageSymptome,
	Symptome as Symptom,
	SymptomeMedicament,
	SymptomeMedicamentRecord
} from './data-contracts';
import { ContentType, HttpClient, type RequestParams } from './http-client';

export class Symptome<SecurityDataType = unknown> extends HttpClient<SecurityDataType> {
	/**
	 * No description
	 *
	 * @tags symptome-controller
	 * @name GetUnique
	 * @request GET:/symptome/{id}
	 */
	getUnique = (id: number, params: RequestParams = {}) =>
		this.request<Symptom, any>({
			path: `/symptome/${id}`,
			method: 'GET',
			...params
		});
	/**
	 * No description
	 *
	 * @tags symptome-controller
	 * @name Update
	 * @request PUT:/symptome/{id}
	 */
	update = (id: number, data: OnlyNomRecord, params: RequestParams = {}) =>
		this.request<Symptom, any>({
			path: `/symptome/${id}`,
			method: 'PUT',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags symptome-controller
	 * @name Delete
	 * @request DELETE:/symptome/{id}
	 */
	delete = (id: number, params: RequestParams = {}) =>
		this.request<Symptom, any>({
			path: `/symptome/${id}`,
			method: 'DELETE',
			...params
		});
	/**
	 * No description
	 *
	 * @tags symptome-medicament-controller
	 * @name GetUnique1
	 * @request GET:/symptome/medicament/{id}
	 */
	getUnique1 = (id: number, params: RequestParams = {}) =>
		this.request<SymptomeMedicament, any>({
			path: `/symptome/medicament/${id}`,
			method: 'GET',
			...params
		});
	/**
	 * No description
	 *
	 * @tags symptome-medicament-controller
	 * @name Update1
	 * @request PUT:/symptome/medicament/{id}
	 */
	update1 = (id: number, data: SymptomeMedicamentRecord, params: RequestParams = {}) =>
		this.request<SymptomeMedicament, any>({
			path: `/symptome/medicament/${id}`,
			method: 'PUT',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags symptome-medicament-controller
	 * @name Delete1
	 * @request DELETE:/symptome/medicament/{id}
	 */
	delete1 = (id: number, params: RequestParams = {}) =>
		this.request<SymptomeMedicament, any>({
			path: `/symptome/medicament/${id}`,
			method: 'DELETE',
			...params
		});
	/**
	 * No description
	 *
	 * @tags symptome-controller
	 * @name Get
	 * @request GET:/symptome
	 */
	get = (
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
		this.request<PageSymptome, any>({
			path: `/symptome`,
			method: 'GET',
			query: query,
			...params
		});
	/**
	 * No description
	 *
	 * @tags symptome-controller
	 * @name Create
	 * @request POST:/symptome
	 */
	create = (data: OnlyNomRecord, params: RequestParams = {}) =>
		this.request<Symptom, any>({
			path: `/symptome`,
			method: 'POST',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags symptome-medicament-controller
	 * @name Create1
	 * @request POST:/symptome/medicament
	 */
	create1 = (data: SymptomeMedicamentRecord, params: RequestParams = {}) =>
		this.request<SymptomeMedicament, any>({
			path: `/symptome/medicament`,
			method: 'POST',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags symptome-medicament-controller
	 * @name GetAll
	 * @request GET:/symptome/medicament/all
	 */
	getAll = (
		query?: {
			ids?: number[];
		},
		params: RequestParams = {}
	) =>
		this.request<SymptomeMedicament[], any>({
			path: `/symptome/medicament/all`,
			method: 'GET',
			query: query,
			...params
		});
	/**
	 * No description
	 *
	 * @tags symptome-controller
	 * @name GetAll1
	 * @request GET:/symptome/all
	 */
	getAll1 = (
		query?: {
			ids?: number[];
		},
		params: RequestParams = {}
	) =>
		this.request<Symptom[], any>({
			path: `/symptome/all`,
			method: 'GET',
			query: query,
			...params
		});
}
