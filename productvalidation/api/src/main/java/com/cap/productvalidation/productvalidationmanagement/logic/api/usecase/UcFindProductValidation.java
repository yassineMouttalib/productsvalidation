package com.cap.productvalidation.productvalidationmanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.cap.productvalidation.productvalidationmanagement.logic.api.to.ProductValidationEto;
import com.cap.productvalidation.productvalidationmanagement.logic.api.to.ProductValidationSearchCriteriaTo;

public interface UcFindProductValidation {

	/**
	 * Returns a ProductValidation by its id 'id'.
	 *
	 * @param id The id 'id' of the ProductValidation.
	 * @return The {@link ProductValidationEto} with id 'id'
	 */
	ProductValidationEto findProductValidation(long id);

	/**
	 * Returns a paginated list of ProductValidations matching the search criteria.
	 *
	 * @param criteria the {@link ProductValidationSearchCriteriaTo}.
	 * @return the {@link List} of matching {@link ProductValidationEto}s.
	 */
	Page<ProductValidationEto> findProductValidations(ProductValidationSearchCriteriaTo criteria);

}
