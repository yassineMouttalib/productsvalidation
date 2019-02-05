package com.cap.productvalidation.testsstepmanagement.assertstepmanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.cap.productvalidation.testsstepmanagement.assertstepmanagement.logic.api.Assertstepmanagement;
import com.cap.productvalidation.testsstepmanagement.assertstepmanagement.logic.api.to.AssertstepEto;
import com.cap.productvalidation.testsstepmanagement.assertstepmanagement.logic.api.to.AssertstepSearchCriteriaTo;
import com.cap.productvalidation.testsstepmanagement.assertstepmanagement.service.api.rest.AssertstepmanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of
 * component {@link Assertstepmanagement}.
 */
@Named("AssertstepmanagementRestService")
public class AssertstepmanagementRestServiceImpl implements AssertstepmanagementRestService {

	@Inject
	private Assertstepmanagement assertstepmanagement;

	@Override
	public AssertstepEto getAssertstep(long id) {
		return this.assertstepmanagement.findAssertstep(id);
	}

	@Override
	public AssertstepEto saveAssertstep(AssertstepEto assertstep) {
		return this.assertstepmanagement.saveAssertstep(assertstep);
	}

	@Override
	public void deleteAssertstep(long id) {
		this.assertstepmanagement.deleteAssertstep(id);
	}

	@Override
	public Page<AssertstepEto> findAssertsteps(AssertstepSearchCriteriaTo searchCriteriaTo) {
		return this.assertstepmanagement.findAssertsteps(searchCriteriaTo);
	}
}