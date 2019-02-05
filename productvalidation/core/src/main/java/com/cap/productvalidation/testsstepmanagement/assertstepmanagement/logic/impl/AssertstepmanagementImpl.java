package com.cap.productvalidation.testsstepmanagement.assertstepmanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.cap.productvalidation.testsstepmanagement.assertstepmanagement.logic.api.Assertstepmanagement;
import com.cap.productvalidation.testsstepmanagement.assertstepmanagement.logic.api.to.AssertstepEto;
import com.cap.productvalidation.testsstepmanagement.assertstepmanagement.logic.api.to.AssertstepSearchCriteriaTo;
import com.cap.productvalidation.testsstepmanagement.assertstepmanagement.logic.api.usecase.UcFindAssertstep;
import com.cap.productvalidation.testsstepmanagement.assertstepmanagement.logic.api.usecase.UcManageAssertstep;
import com.cap.productvalidation.testsstepmanagement.general.logic.base.AbstractComponentFacade;

/**
 * Implementation of component interface of assertstepmanagement
 */
@Named
public class AssertstepmanagementImpl extends AbstractComponentFacade implements Assertstepmanagement {

	@Inject
	private UcFindAssertstep ucFindAssertstep;

	@Inject
	private UcManageAssertstep ucManageAssertstep;

	@Override
	public AssertstepEto findAssertstep(long id) {

		return this.ucFindAssertstep.findAssertstep(id);
	}

	@Override
	public Page<AssertstepEto> findAssertsteps(AssertstepSearchCriteriaTo criteria) {
		return this.ucFindAssertstep.findAssertsteps(criteria);
	}

	@Override
	public AssertstepEto saveAssertstep(AssertstepEto assertstep) {

		return this.ucManageAssertstep.saveAssertstep(assertstep);
	}

	@Override
	public boolean deleteAssertstep(long id) {

		return this.ucManageAssertstep.deleteAssertstep(id);
	}
}
