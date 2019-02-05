package com.cap.productvalidation.testsstepmanagement.reststepmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.cap.productvalidation.testsstepmanagement.general.logic.base.AbstractUc;
import com.cap.productvalidation.testsstepmanagement.reststepmanagement.dataaccess.api.repo.ReststepRepository;

/**
 * Abstract use case for Reststeps, which provides access to the commonly
 * necessary data access objects.
 */
public class AbstractReststepUc extends AbstractUc {

	/** @see #getReststepRepository() */
	@Inject
	private ReststepRepository reststepRepository;

	/**
	 * Returns the field 'reststepRepository'.
	 * 
	 * @return the {@link ReststepRepository} instance.
	 */
	public ReststepRepository getReststepRepository() {

		return this.reststepRepository;
	}

}
