package com.cap.productsvalidation.testscasesmanagement.dataaccess.api.dao;

import com.cap.productsvalidation.general.dataaccess.api.dao.ApplicationDao;
import com.cap.productsvalidation.testscasesmanagement.dataaccess.api.TestscasesEntity;
import com.cap.productsvalidation.testscasesmanagement.logic.api.to.TestscasesSearchCriteriaTo;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Data access interface for Testscases entities
 */
public interface TestscasesDao extends ApplicationDao<TestscasesEntity> {

	/**
	 * Finds the {@link TestscasesEntity testscasess} matching the given
	 * {@link TestscasesSearchCriteriaTo}.
	 *
	 * @param criteria
	 *            is the {@link TestscasesSearchCriteriaTo}.
	 * @return the {@link PaginatedListTo} with the matching
	 *         {@link TestscasesEntity} objects.
	 */
	PaginatedListTo<TestscasesEntity> findTestscasess(TestscasesSearchCriteriaTo criteria);

}
