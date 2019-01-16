package com.cap.productsvalidation.productvalidationmanagement.dataaccess.api.dao;

import com.cap.productsvalidation.general.dataaccess.api.dao.ApplicationDao;
import com.cap.productsvalidation.productvalidationmanagement.dataaccess.api.ProductValidationEntity;
import com.cap.productsvalidation.productvalidationmanagement.logic.api.to.ProductValidationSearchCriteriaTo;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Data access interface for ProductValidation entities
 */
public interface ProductValidationDao extends ApplicationDao<ProductValidationEntity> {

	/**
	 * Finds the {@link ProductValidationEntity productvalidations} matching the
	 * given {@link ProductValidationSearchCriteriaTo}.
	 *
	 * @param criteria
	 *            is the {@link ProductValidationSearchCriteriaTo}.
	 * @return the {@link PaginatedListTo} with the matching
	 *         {@link ProductValidationEntity} objects.
	 */
	PaginatedListTo<ProductValidationEntity> findProductValidations(ProductValidationSearchCriteriaTo criteria);
}
