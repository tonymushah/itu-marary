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
	Maladie,
	MaladieSymptome,
	MaladieSymptomeRecord,
	OnlyNomRecord,
	PageMaladie
} from './data-contracts';
import { ContentType, HttpClient, RequestParams } from './http-client';

export class Maladie<SecurityDataType = unknown> extends HttpClient<SecurityDataType> {
	/**
	 * No description
	 *
	 * @tags maladie-controller
	 * @name GetUnique13
	 * @request GET:/maladie/{id}
	 */
	getUnique13 = (id: number, params: RequestParams = {}) =>
		this.request<Maladie, any>({
			path: `/maladie/${id}`,
			method: 'GET',
			...params
		});
	/**
	 * No description
	 *
	 * @tags maladie-controller
	 * @name Update13
	 * @request PUT:/maladie/{id}
	 */
	update13 = (id: number, data: OnlyNomRecord, params: RequestParams = {}) =>
		this.request<Maladie, any>({
			path: `/maladie/${id}`,
			method: 'PUT',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags maladie-controller
	 * @name Delete13
	 * @request DELETE:/maladie/{id}
	 */
	delete13 = (id: number, params: RequestParams = {}) =>
		this.request<Maladie, any>({
			path: `/maladie/${id}`,
			method: 'DELETE',
			...params
		});
	/**
	 * No description
	 *
	 * @tags maladie-symptome-controller
	 * @name GetUnique14
	 * @request GET:/maladie/symptome/{id}
	 */
	getUnique14 = (id: number, params: RequestParams = {}) =>
		this.request<MaladieSymptome, any>({
			path: `/maladie/symptome/${id}`,
			method: 'GET',
			...params
		});
	/**
	 * No description
	 *
	 * @tags maladie-symptome-controller
	 * @name Update14
	 * @request PUT:/maladie/symptome/{id}
	 */
	update14 = (id: number, data: MaladieSymptomeRecord, params: RequestParams = {}) =>
		this.request<MaladieSymptome, any>({
			path: `/maladie/symptome/${id}`,
			method: 'PUT',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags maladie-symptome-controller
	 * @name Delete14
	 * @request DELETE:/maladie/symptome/{id}
	 */
	delete14 = (id: number, params: RequestParams = {}) =>
		this.request<MaladieSymptome, any>({
			path: `/maladie/symptome/${id}`,
			method: 'DELETE',
			...params
		});
	/**
	 * No description
	 *
	 * @tags maladie-controller
	 * @name Get6
	 * @request GET:/maladie
	 */
	get6 = (
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
		this.request<PageMaladie, any>({
			path: `/maladie`,
			method: 'GET',
			query: query,
			...params
		});
	/**
	 * No description
	 *
	 * @tags maladie-controller
	 * @name Create13
	 * @request POST:/maladie
	 */
	create13 = (data: OnlyNomRecord, params: RequestParams = {}) =>
		this.request<Maladie, any>({
			path: `/maladie`,
			method: 'POST',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags maladie-symptome-controller
	 * @name Create14
	 * @request POST:/maladie/symptome
	 */
	create14 = (data: MaladieSymptomeRecord, params: RequestParams = {}) =>
		this.request<MaladieSymptome, any>({
			path: `/maladie/symptome`,
			method: 'POST',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags maladie-symptome-controller
	 * @name GetAll13
	 * @request GET:/maladie/symptome/all
	 */
	getAll13 = (
		query?: {
			ids?: number[];
		},
		params: RequestParams = {}
	) =>
		this.request<object, any>({
			path: `/maladie/symptome/all`,
			method: 'GET',
			query: query,
			...params
		});
	/**
	 * No description
	 *
	 * @tags maladie-controller
	 * @name GetAll14
	 * @request GET:/maladie/all
	 */
	getAll14 = (
		query?: {
			ids?: number[];
		},
		params: RequestParams = {}
	) =>
		this.request<object, any>({
			path: `/maladie/all`,
			method: 'GET',
			query: query,
			...params
		});
}
