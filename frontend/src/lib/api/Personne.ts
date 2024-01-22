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

import { Personne, PersonneAlergie, PersonneAlergieRecord, PersonneRecord } from './data-contracts';
import { ContentType, HttpClient, RequestParams } from './http-client';

export class Personne<SecurityDataType = unknown> extends HttpClient<SecurityDataType> {
	/**
	 * No description
	 *
	 * @tags personne-controller
	 * @name GetUnique3
	 * @request GET:/personne/{id}
	 */
	getUnique3 = (id: number, params: RequestParams = {}) =>
		this.request<Personne, any>({
			path: `/personne/${id}`,
			method: 'GET',
			...params
		});
	/**
	 * No description
	 *
	 * @tags personne-controller
	 * @name Update3
	 * @request PUT:/personne/{id}
	 */
	update3 = (id: number, data: PersonneRecord, params: RequestParams = {}) =>
		this.request<Personne, any>({
			path: `/personne/${id}`,
			method: 'PUT',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags personne-controller
	 * @name Delete3
	 * @request DELETE:/personne/{id}
	 */
	delete3 = (id: number, params: RequestParams = {}) =>
		this.request<Personne, any>({
			path: `/personne/${id}`,
			method: 'DELETE',
			...params
		});
	/**
	 * No description
	 *
	 * @tags personne-alergie-controller
	 * @name GetUnique4
	 * @request GET:/personne/alergie/{id}
	 */
	getUnique4 = (id: number, params: RequestParams = {}) =>
		this.request<PersonneAlergie, any>({
			path: `/personne/alergie/${id}`,
			method: 'GET',
			...params
		});
	/**
	 * No description
	 *
	 * @tags personne-alergie-controller
	 * @name Update4
	 * @request PUT:/personne/alergie/{id}
	 */
	update4 = (id: number, data: PersonneAlergieRecord, params: RequestParams = {}) =>
		this.request<PersonneAlergie, any>({
			path: `/personne/alergie/${id}`,
			method: 'PUT',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags personne-alergie-controller
	 * @name Delete4
	 * @request DELETE:/personne/alergie/{id}
	 */
	delete4 = (id: number, params: RequestParams = {}) =>
		this.request<PersonneAlergie, any>({
			path: `/personne/alergie/${id}`,
			method: 'DELETE',
			...params
		});
	/**
	 * No description
	 *
	 * @tags personne-controller
	 * @name Create3
	 * @request POST:/personne
	 */
	create3 = (data: PersonneRecord, params: RequestParams = {}) =>
		this.request<Personne, any>({
			path: `/personne`,
			method: 'POST',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags personne-alergie-controller
	 * @name Create4
	 * @request POST:/personne/alergie
	 */
	create4 = (data: PersonneAlergieRecord, params: RequestParams = {}) =>
		this.request<PersonneAlergie, any>({
			path: `/personne/alergie`,
			method: 'POST',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags personne-controller
	 * @name GetAll3
	 * @request GET:/personne/all
	 */
	getAll3 = (
		query?: {
			ids?: number[];
		},
		params: RequestParams = {}
	) =>
		this.request<object, any>({
			path: `/personne/all`,
			method: 'GET',
			query: query,
			...params
		});
	/**
	 * No description
	 *
	 * @tags personne-alergie-controller
	 * @name GetAll4
	 * @request GET:/personne/alergie/all
	 */
	getAll4 = (
		query?: {
			ids?: number[];
		},
		params: RequestParams = {}
	) =>
		this.request<object, any>({
			path: `/personne/alergie/all`,
			method: 'GET',
			query: query,
			...params
		});
}
