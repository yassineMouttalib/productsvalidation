package com.cap.productsvalidation.productvalidationmanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import com.cap.productsvalidation.productvalidationmanagement.logic.api.Productvalidationmanagement;
import com.cap.productsvalidation.productvalidationmanagement.logic.api.to.ProductValidationCto;
import com.cap.productsvalidation.productvalidationmanagement.logic.api.to.ProductValidationEto;
import com.cap.productsvalidation.productvalidationmanagement.logic.api.to.ProductValidationSearchCriteriaTo;
import com.cap.productsvalidation.productvalidationmanagement.service.api.rest.ProductvalidationmanagementRestService;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * The service implementation for REST calls in order to execute the logic of
 * component {@link Productvalidationmanagement}.
 */
@Named("ProductvalidationmanagementRestService")
public class ProductvalidationmanagementRestServiceImpl implements ProductvalidationmanagementRestService {

	@Inject
	private Productvalidationmanagement productvalidationmanagement;

	@Override
	public ProductValidationEto getProductValidation(long id) {
		return this.productvalidationmanagement.findProductValidation(id);
	}

	@Override
	public ProductValidationEto saveProductValidation(ProductValidationEto productvalidation) {
		return this.productvalidationmanagement.saveProductValidation(productvalidation);
	}

	@Override
	public void deleteProductValidation(long id) {
		this.productvalidationmanagement.deleteProductValidation(id);
	}

	@Override
	public PaginatedListTo<ProductValidationEto> findProductValidationsByPost(
			ProductValidationSearchCriteriaTo searchCriteriaTo) {
		return this.productvalidationmanagement.findProductValidationEtos(searchCriteriaTo);
	}

	@Override
	public ProductValidationCto getProductValidationCto(long id) {
		return this.productvalidationmanagement.findProductValidationCto(id);
	}

	@Override
	public PaginatedListTo<ProductValidationCto> findProductValidationCtosByPost(
			ProductValidationSearchCriteriaTo searchCriteriaTo) {
		return this.productvalidationmanagement.findProductValidationCtos(searchCriteriaTo);
	}
}