package com.cap.productvalidation.testscasesmanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.cap.productvalidation.general.logic.base.AbstractComponentFacade;
import com.cap.productvalidation.testscasesmanagement.logic.api.Testscasesmanagement;
import com.cap.productvalidation.testscasesmanagement.logic.api.to.TestscasesEto;
import com.cap.productvalidation.testscasesmanagement.logic.api.to.TestscasesSearchCriteriaTo;
import com.cap.productvalidation.testscasesmanagement.logic.api.usecase.UcFindTestscases;
import com.cap.productvalidation.testscasesmanagement.logic.api.usecase.UcManageTestscases;

/**
 * Implementation of component interface of testscasesmanagement
 */
@Named
public class TestscasesmanagementImpl extends AbstractComponentFacade implements Testscasesmanagement {

	@Inject
	private UcFindTestscases ucFindTestscases;

	@Inject
	private UcManageTestscases ucManageTestscases;

	@Override
	public TestscasesEto findTestscases(long id) {

		return this.ucFindTestscases.findTestscases(id);
	}

	@Override
	public Page<TestscasesEto> findTestscasess(TestscasesSearchCriteriaTo criteria) {
		return this.ucFindTestscases.findTestscasess(criteria);
	}

	@Override
	public TestscasesEto saveTestscases(TestscasesEto testscases) {

		return this.ucManageTestscases.saveTestscases(testscases);
	}

	@Override
	public boolean deleteTestscases(long id) {

		return this.ucManageTestscases.deleteTestscases(id);
	}
}
