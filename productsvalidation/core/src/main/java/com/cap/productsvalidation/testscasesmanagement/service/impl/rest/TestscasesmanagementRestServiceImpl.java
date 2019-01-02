package com.cap.productsvalidation.testscasesmanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import com.cap.productsvalidation.testscasesmanagement.logic.api.Testscasesmanagement;
import com.cap.productsvalidation.testscasesmanagement.logic.api.to.TestscasesCto;
import com.cap.productsvalidation.testscasesmanagement.logic.api.to.TestscasesEto;
import com.cap.productsvalidation.testscasesmanagement.logic.api.to.TestscasesSearchCriteriaTo;
import com.cap.productsvalidation.testscasesmanagement.service.api.rest.TestscasesmanagementRestService;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * The service implementation for REST calls in order to execute the logic of
 * component {@link Testscasesmanagement}.
 */
@Named("TestscasesmanagementRestService")
public class TestscasesmanagementRestServiceImpl implements TestscasesmanagementRestService {

	@Inject
	private Testscasesmanagement testscasesmanagement;

	@Override
	public TestscasesEto getTestscases(long id) {
		return this.testscasesmanagement.findTestscases(id);
	}

	@Override
	public TestscasesEto saveTestscases(TestscasesEto testscases) {
		return this.testscasesmanagement.saveTestscases(testscases);
	}

	@Override
	public void deleteTestscases(long id) {
		this.testscasesmanagement.deleteTestscases(id);
	}

	@Override
	public PaginatedListTo<TestscasesEto> findTestscasessByPost(TestscasesSearchCriteriaTo searchCriteriaTo) {
		return this.testscasesmanagement.findTestscasesEtos(searchCriteriaTo);
	}

	@Override
	public TestscasesCto getTestscasesCto(long id) {
		return this.testscasesmanagement.findTestscasesCto(id);
	}

	@Override
	public PaginatedListTo<TestscasesCto> findTestscasesCtosByPost(TestscasesSearchCriteriaTo searchCriteriaTo) {
		return this.testscasesmanagement.findTestscasesCtos(searchCriteriaTo);
	}

}
