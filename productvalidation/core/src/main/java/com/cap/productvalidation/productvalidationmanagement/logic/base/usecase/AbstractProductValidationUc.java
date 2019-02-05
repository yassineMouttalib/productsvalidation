package com.cap.productvalidation.productvalidationmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.cap.productvalidation.general.logic.base.AbstractUc;
import com.cap.productvalidation.productvalidationmanagement.dataaccess.api.repo.ProductValidationRepository;

/**
 * Abstract use case for ProductValidations, which provides access to the
 * commonly necessary data access objects.
 */
public class AbstractProductValidationUc extends AbstractUc {

	/** @see #getProductValidationRepository() */
	@Inject
	private ProductValidationRepository productValidationRepository;

	/**
	 * Returns the field 'productValidationRepository'.
	 * 
	 * @return the {@link ProductValidationRepository} instance.
	 */
	public ProductValidationRepository getProductValidationRepository() {

		return this.productValidationRepository;
	}

}
