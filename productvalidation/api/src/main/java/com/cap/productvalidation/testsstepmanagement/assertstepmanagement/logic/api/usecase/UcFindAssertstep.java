package com.cap.productvalidation.testsstepmanagement.assertstepmanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.cap.productvalidation.testsstepmanagement.assertstepmanagement.logic.api.to.AssertstepEto;
import com.cap.productvalidation.testsstepmanagement.assertstepmanagement.logic.api.to.AssertstepSearchCriteriaTo;

public interface UcFindAssertstep {

	/**
	 * Returns a Assertstep by its id 'id'.
	 *
	 * @param id The id 'id' of the Assertstep.
	 * @return The {@link AssertstepEto} with id 'id'
	 */
	AssertstepEto findAssertstep(long id);

	/**
	 * Returns a paginated list of Assertsteps matching the search criteria.
	 *
	 * @param criteria the {@link AssertstepSearchCriteriaTo}.
	 * @return the {@link List} of matching {@link AssertstepEto}s.
	 */
	Page<AssertstepEto> findAssertsteps(AssertstepSearchCriteriaTo criteria);

}
