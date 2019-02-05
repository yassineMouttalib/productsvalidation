package com.cap.productvalidation.productvalidationmanagement.logic.api.usecase;

import com.cap.productvalidation.productvalidationmanagement.logic.api.to.ProductValidationEto;

/**
 * Interface of UcManageProductValidation to centralize documentation and
 * signatures of methods.
 */
public interface UcManageProductValidation {

	/**
	 * Deletes a productValidation from the database by its id
	 * 'productValidationId'.
	 *
	 * @param productValidationId Id of the productValidation to delete
	 * @return boolean <code>true</code> if the productValidation can be deleted,
	 *         <code>false</code> otherwise
	 */
	boolean deleteProductValidation(long productValidationId);

	/**
	 * Saves a productValidation and store it in the database.
	 *
	 * @param productValidation the {@link ProductValidationEto} to create.
	 * @return the new {@link ProductValidationEto} that has been saved with ID and
	 *         version.
	 */
	ProductValidationEto saveProductValidation(ProductValidationEto productValidation);

}
