package com.cap.productvalidation.testscasesmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.cap.productvalidation.general.logic.base.AbstractUc;
import com.cap.productvalidation.testscasesmanagement.dataaccess.api.repo.TestscasesRepository;

/**
 * Abstract use case for Testscasess, which provides access to the commonly
 * necessary data access objects.
 */
public class AbstractTestscasesUc extends AbstractUc {

	/** @see #getTestscasesRepository() */
	@Inject
	private TestscasesRepository testscasesRepository;

	/**
	 * Returns the field 'testscasesRepository'.
	 * 
	 * @return the {@link TestscasesRepository} instance.
	 */
	public TestscasesRepository getTestscasesRepository() {

		return this.testscasesRepository;
	}

}
