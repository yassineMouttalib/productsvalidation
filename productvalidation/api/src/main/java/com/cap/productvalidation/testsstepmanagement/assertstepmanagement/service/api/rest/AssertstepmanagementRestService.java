package com.cap.productvalidation.testsstepmanagement.assertstepmanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.cap.productvalidation.testsstepmanagement.assertstepmanagement.logic.api.Assertstepmanagement;
import com.cap.productvalidation.testsstepmanagement.assertstepmanagement.logic.api.to.AssertstepEto;
import com.cap.productvalidation.testsstepmanagement.assertstepmanagement.logic.api.to.AssertstepSearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of
 * component {@link Assertstepmanagement}.
 */
@Path("/assertstepmanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface AssertstepmanagementRestService {

	/**
	 * Delegates to {@link Assertstepmanagement#findAssertstep}.
	 *
	 * @param id the ID of the {@link AssertstepEto}
	 * @return the {@link AssertstepEto}
	 */
	@GET
	@Path("/assertstep/{id}/")
	public AssertstepEto getAssertstep(@PathParam("id") long id);

	/**
	 * Delegates to {@link Assertstepmanagement#saveAssertstep}.
	 *
	 * @param assertstep the {@link AssertstepEto} to be saved
	 * @return the recently created {@link AssertstepEto}
	 */
	@POST
	@Path("/assertstep/")
	public AssertstepEto saveAssertstep(AssertstepEto assertstep);

	/**
	 * Delegates to {@link Assertstepmanagement#deleteAssertstep}.
	 *
	 * @param id ID of the {@link AssertstepEto} to be deleted
	 */
	@DELETE
	@Path("/assertstep/{id}/")
	public void deleteAssertstep(@PathParam("id") long id);

	/**
	 * Delegates to {@link Assertstepmanagement#findAssertstepEtos}.
	 *
	 * @param searchCriteriaTo the pagination and search criteria to be used for
	 *                         finding assertsteps.
	 * @return the {@link Page list} of matching {@link AssertstepEto}s.
	 */
	@Path("/assertstep/search")
	@POST
	public Page<AssertstepEto> findAssertsteps(AssertstepSearchCriteriaTo searchCriteriaTo);

}