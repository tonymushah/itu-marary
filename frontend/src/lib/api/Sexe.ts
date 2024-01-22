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

import { OnlyNomRecord, PageSexe, Sexe } from './data-contracts';
import { ContentType, HttpClient, RequestParams } from './http-client';

export class Sexe<SecurityDataType = unknown> extends HttpClient<SecurityDataType> {
	/**
	 * No description
	 *
	 * @tags sexe-controller
	 * @name GetUnique2
	 * @request GET:/sexe/{id}
	 */
	getUnique2 = (id: number, params: RequestParams = {}) =>
		this.request<Sexe, any>({
			path: `/sexe/${id}`,
			method: 'GET',
			...params
		});
	/**
	 * No description
	 *
	 * @tags sexe-controller
	 * @name Update2
	 * @request PUT:/sexe/{id}
	 */
	update2 = (id: number, data: OnlyNomRecord, params: RequestParams = {}) =>
		this.request<Sexe, any>({
			path: `/sexe/${id}`,
			method: 'PUT',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags sexe-controller
	 * @name Delete2
	 * @request DELETE:/sexe/{id}
	 */
	delete2 = (id: number, params: RequestParams = {}) =>
		this.request<Sexe, any>({
			path: `/sexe/${id}`,
			method: 'DELETE',
			...params
		});
	/**
	 * No description
	 *
	 * @tags sexe-controller
	 * @name Get1
	 * @request GET:/sexe
	 */
	get1 = (
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
		this.request<PageSexe, any>({
			path: `/sexe`,
			method: 'GET',
			query: query,
			...params
		});
	/**
	 * No description
	 *
	 * @tags sexe-controller
	 * @name Create2
	 * @request POST:/sexe
	 */
	create2 = (data: OnlyNomRecord, params: RequestParams = {}) =>
		this.request<Sexe, any>({
			path: `/sexe`,
			method: 'POST',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags sexe-controller
	 * @name GetAll2
	 * @request GET:/sexe/all
	 */
	getAll2 = (
		query?: {
			ids?: number[];
		},
		params: RequestParams = {}
	) =>
		this.request<object, any>({
			path: `/sexe/all`,
			method: 'GET',
			query: query,
			...params
		});
}
