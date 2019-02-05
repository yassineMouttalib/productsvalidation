package com.cap.productvalidation.productvalidationmanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.cap.productvalidation.productvalidationmanagement.logic.api.Productvalidationmanagement;
import com.cap.productvalidation.productvalidationmanagement.logic.api.to.ProductValidationEto;
import com.cap.productvalidation.productvalidationmanagement.logic.api.to.ProductValidationSearchCriteriaTo;
import com.cap.productvalidation.productvalidationmanagement.service.api.rest.ProductvalidationmanagementRestService;

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
	public Page<ProductValidationEto> findProductValidations(ProductValidationSearchCriteriaTo searchCriteriaTo) {
		return this.productvalidationmanagement.findProductValidations(searchCriteriaTo);
	}
}