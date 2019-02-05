package com.cap.productvalidation.testsstepmanagement.reststepmanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.cap.productvalidation.testsstepmanagement.general.logic.base.AbstractComponentFacade;
import com.cap.productvalidation.testsstepmanagement.reststepmanagement.logic.api.Reststepmanagement;
import com.cap.productvalidation.testsstepmanagement.reststepmanagement.logic.api.to.ReststepEto;
import com.cap.productvalidation.testsstepmanagement.reststepmanagement.logic.api.to.ReststepSearchCriteriaTo;
import com.cap.productvalidation.testsstepmanagement.reststepmanagement.logic.api.usecase.UcFindReststep;
import com.cap.productvalidation.testsstepmanagement.reststepmanagement.logic.api.usecase.UcManageReststep;

/**
 * Implementation of component interface of reststepmanagement
 */
@Named
public class ReststepmanagementImpl extends AbstractComponentFacade implements Reststepmanagement {

	@Inject
	private UcFindReststep ucFindReststep;

	@Inject
	private UcManageReststep ucManageReststep;

	@Override
	public ReststepEto findReststep(long id) {

		return this.ucFindReststep.findReststep(id);
	}

	@Override
	public Page<ReststepEto> findReststeps(ReststepSearchCriteriaTo criteria) {
		return this.ucFindReststep.findReststeps(criteria);
	}

	@Override
	public ReststepEto saveReststep(ReststepEto reststep) {

		return this.ucManageReststep.saveReststep(reststep);
	}

	@Override
	public boolean deleteReststep(long id) {

		return this.ucManageReststep.deleteReststep(id);
	}
}
