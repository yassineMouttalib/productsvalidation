package com.cap.productvalidation.productvalidationmanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.cap.productvalidation.general.logic.base.AbstractComponentFacade;
import com.cap.productvalidation.productvalidationmanagement.logic.api.Productvalidationmanagement;
import com.cap.productvalidation.productvalidationmanagement.logic.api.to.ProductValidationEto;
import com.cap.productvalidation.productvalidationmanagement.logic.api.to.ProductValidationSearchCriteriaTo;
import com.cap.productvalidation.productvalidationmanagement.logic.api.usecase.UcFindProductValidation;
import com.cap.productvalidation.productvalidationmanagement.logic.api.usecase.UcManageProductValidation;

/**
 * Implementation of component interface of productvalidationmanagement
 */
@Named
public class ProductvalidationmanagementImpl extends AbstractComponentFacade implements Productvalidationmanagement {

	@Inject
	private UcFindProductValidation ucFindProductValidation;

	@Inject
	private UcManageProductValidation ucManageProductValidation;

	@Override
	public ProductValidationEto findProductValidation(long id) {

		return this.ucFindProductValidation.findProductValidation(id);
	}

	@Override
	public Page<ProductValidationEto> findProductValidations(ProductValidationSearchCriteriaTo criteria) {
		return this.ucFindProductValidation.findProductValidations(criteria);
	}

	@Override
	public ProductValidationEto saveProductValidation(ProductValidationEto productvalidation) {

		return this.ucManageProductValidation.saveProductValidation(productvalidation);
	}

	@Override
	public boolean deleteProductValidation(long id) {

		return this.ucManageProductValidation.deleteProductValidation(id);
	}
}
