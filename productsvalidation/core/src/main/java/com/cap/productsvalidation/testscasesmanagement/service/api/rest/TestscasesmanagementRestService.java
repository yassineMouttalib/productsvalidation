package com.cap.productsvalidation.testscasesmanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cap.productsvalidation.testscasesmanagement.logic.api.Testscasesmanagement;
import com.cap.productsvalidation.testscasesmanagement.logic.api.to.TestscasesCto;
import com.cap.productsvalidation.testscasesmanagement.logic.api.to.TestscasesEto;
import com.cap.productsvalidation.testscasesmanagement.logic.api.to.TestscasesSearchCriteriaTo;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * The service interface for REST calls in order to execute the logic of
 * component {@link Testscasesmanagement}.
 */
@Path("/testscasesmanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface TestscasesmanagementRestService {

	/**
	 * Delegates to {@link Testscasesmanagement#findTestscases}.
	 *
	 * @param id
	 *            the ID of the {@link TestscasesEto}
	 * @return the {@link TestscasesEto}
	 */
	@GET
	@Path("/testscases/{id}/")
	public TestscasesEto getTestscases(@PathParam("id") long id);

	/**
	 * Delegates to {@link Testscasesmanagement#saveTestscases}.
	 *
	 * @param testscases
	 *            the {@link TestscasesEto} to be saved
	 * @return the recently created {@link TestscasesEto}
	 */
	@POST
	@Path("/testscases/")
	public TestscasesEto saveTestscases(TestscasesEto testscases);

	/**
	 * Delegates to {@link Testscasesmanagement#deleteTestscases}.
	 *
	 * @param id
	 *            ID of the {@link TestscasesEto} to be deleted
	 */
	@DELETE
	@Path("/testscases/{id}/")
	public void deleteTestscases(@PathParam("id") long id);

	/**
	 * Delegates to {@link Testscasesmanagement#findTestscasesEtos}.
	 *
	 * @param searchCriteriaTo
	 *            the pagination and search criteria to be used for finding
	 *            testscasess.
	 * @return the {@link PaginatedListTo list} of matching {@link TestscasesEto}s.
	 */
	@Path("/testscases/search")
	@POST
	public PaginatedListTo<TestscasesEto> findTestscasessByPost(TestscasesSearchCriteriaTo searchCriteriaTo);

	/**
	 * Delegates to {@link Testscasesmanagement#findTestscasesCto}.
	 *
	 * @param id
	 *            the ID of the {@link TestscasesCto}
	 * @return the {@link TestscasesCto}
	 */
	@GET
	@Path("/testscases/cto/{id}/")
	public TestscasesCto getTestscasesCto(@PathParam("id") long id);

	/**
	 * Delegates to {@link Testscasesmanagement#findTestscasesCtos}.
	 *
	 * @param searchCriteriaTo
	 *            the pagination and search criteria to be used for finding
	 *            testscasess.
	 * @return the {@link PaginatedListTo list} of matching {@link TestscasesCto}s.
	 */
	@Path("/testscases/cto/search")
	@POST
	public PaginatedListTo<TestscasesCto> findTestscasesCtosByPost(TestscasesSearchCriteriaTo searchCriteriaTo);

}
