package com.cap.productsvalidation.testscasesmanagement.logic.api;

import com.cap.productsvalidation.testscasesmanagement.logic.api.to.TestscasesCto;
import com.cap.productsvalidation.testscasesmanagement.logic.api.to.TestscasesEto;
import com.cap.productsvalidation.testscasesmanagement.logic.api.to.TestscasesSearchCriteriaTo;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Interface for Testscasesmanagement component.
 */
public interface Testscasesmanagement {

	/**
	 * Returns a Testscases by its id 'id'.
	 *
	 * @param id
	 *            The id 'id' of the Testscases.
	 * @return The {@link TestscasesEto} with id 'id'
	 */
	TestscasesEto findTestscases(Long id);

	/**
	 * Returns a paginated list of Testscasess matching the search criteria.
	 *
	 * @param criteria
	 *            the {@link TestscasesSearchCriteriaTo}.
	 * @return the {@link List} of matching {@link TestscasesEto}s.
	 */
	PaginatedListTo<TestscasesEto> findTestscasesEtos(TestscasesSearchCriteriaTo criteria);

	/**
	 * Deletes a testscases from the database by its id 'testscasesId'.
	 *
	 * @param testscasesId
	 *            Id of the testscases to delete
	 * @return boolean <code>true</code> if the testscases can be deleted,
	 *         <code>false</code> otherwise
	 */
	boolean deleteTestscases(Long testscasesId);

	/**
	 * Saves a testscases and store it in the database.
	 *
	 * @param testscases
	 *            the {@link TestscasesEto} to create.
	 * @return the new {@link TestscasesEto} that has been saved with ID and
	 *         version.
	 */
	TestscasesEto saveTestscases(TestscasesEto testscases);

	/**
	 * Returns a composite Testscases by its id 'id'.
	 *
	 * @param id
	 *            The id 'id' of the Testscases.
	 * @return The {@link TestscasesCto} with id 'id'
	 */
	TestscasesCto findTestscasesCto(Long id);

	/**
	 * Returns a paginated list of composite Testscasess matching the search
	 * criteria.
	 *
	 * @param criteria
	 *            the {@link TestscasesSearchCriteriaTo}.
	 * @return the {@link List} of matching {@link TestscasesCto}s.
	 */
	PaginatedListTo<TestscasesCto> findTestscasesCtos(TestscasesSearchCriteriaTo criteria);

}
