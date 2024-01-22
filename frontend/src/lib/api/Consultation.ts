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
	Consultation,
	ConsultationRecord,
	ConsultationSymptome,
	ConsultationSymptomeRecord,
	PageConsultation
} from './data-contracts';
import { ContentType, HttpClient, RequestParams } from './http-client';

export class Consultation<SecurityDataType = unknown> extends HttpClient<SecurityDataType> {
	/**
	 * No description
	 *
	 * @tags consultation-controller
	 * @name GetUnique15
	 * @request GET:/consultation/{id}
	 */
	getUnique15 = (id: number, params: RequestParams = {}) =>
		this.request<Consultation, any>({
			path: `/consultation/${id}`,
			method: 'GET',
			...params
		});
	/**
	 * No description
	 *
	 * @tags consultation-controller
	 * @name Update15
	 * @request PUT:/consultation/{id}
	 */
	update15 = (id: number, data: ConsultationRecord, params: RequestParams = {}) =>
		this.request<Consultation, any>({
			path: `/consultation/${id}`,
			method: 'PUT',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags consultation-controller
	 * @name Delete15
	 * @request DELETE:/consultation/{id}
	 */
	delete15 = (id: number, params: RequestParams = {}) =>
		this.request<Consultation, any>({
			path: `/consultation/${id}`,
			method: 'DELETE',
			...params
		});
	/**
	 * No description
	 *
	 * @tags consultation-symptome-controller
	 * @name GetUnique16
	 * @request GET:/consultation/symptome/{id}
	 */
	getUnique16 = (id: number, params: RequestParams = {}) =>
		this.request<ConsultationSymptome, any>({
			path: `/consultation/symptome/${id}`,
			method: 'GET',
			...params
		});
	/**
	 * No description
	 *
	 * @tags consultation-symptome-controller
	 * @name Update16
	 * @request PUT:/consultation/symptome/{id}
	 */
	update16 = (id: number, data: ConsultationSymptomeRecord, params: RequestParams = {}) =>
		this.request<ConsultationSymptome, any>({
			path: `/consultation/symptome/${id}`,
			method: 'PUT',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags consultation-symptome-controller
	 * @name Delete16
	 * @request DELETE:/consultation/symptome/{id}
	 */
	delete16 = (id: number, params: RequestParams = {}) =>
		this.request<ConsultationSymptome, any>({
			path: `/consultation/symptome/${id}`,
			method: 'DELETE',
			...params
		});
	/**
	 * No description
	 *
	 * @tags consultation-controller
	 * @name Search
	 * @request GET:/consultation
	 */
	search = (
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
		},
		params: RequestParams = {}
	) =>
		this.request<PageConsultation, any>({
			path: `/consultation`,
			method: 'GET',
			query: query,
			...params
		});
	/**
	 * No description
	 *
	 * @tags consultation-controller
	 * @name Create15
	 * @request POST:/consultation
	 */
	create15 = (data: ConsultationRecord, params: RequestParams = {}) =>
		this.request<Consultation, any>({
			path: `/consultation`,
			method: 'POST',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags consultation-symptome-controller
	 * @name Create16
	 * @request POST:/consultation/symptome
	 */
	create16 = (data: ConsultationSymptomeRecord, params: RequestParams = {}) =>
		this.request<ConsultationSymptome, any>({
			path: `/consultation/symptome`,
			method: 'POST',
			body: data,
			type: ContentType.Json,
			...params
		});
	/**
	 * No description
	 *
	 * @tags consultation-symptome-controller
	 * @name GetAll15
	 * @request GET:/consultation/symptome/all
	 */
	getAll15 = (
		query?: {
			ids?: number[];
		},
		params: RequestParams = {}
	) =>
		this.request<object, any>({
			path: `/consultation/symptome/all`,
			method: 'GET',
			query: query,
			...params
		});
	/**
	 * No description
	 *
	 * @tags consultation-controller
	 * @name GetAll16
	 * @request GET:/consultation/all
	 */
	getAll16 = (
		query?: {
			ids?: number[];
		},
		params: RequestParams = {}
	) =>
		this.request<object, any>({
			path: `/consultation/all`,
			method: 'GET',
			query: query,
			...params
		});
}
