package com.cap.productsvalidation.testscasesmanagement.logic.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.cap.productsvalidation.general.logic.base.AbstractComponentFacade;
import com.cap.productsvalidation.testscasesmanagement.dataaccess.api.TestscasesEntity;
import com.cap.productsvalidation.testscasesmanagement.dataaccess.api.dao.TestscasesDao;
import com.cap.productsvalidation.testscasesmanagement.logic.api.Testscasesmanagement;
import com.cap.productsvalidation.testscasesmanagement.logic.api.to.TestscasesCto;
import com.cap.productsvalidation.testscasesmanagement.logic.api.to.TestscasesEto;
import com.cap.productsvalidation.testscasesmanagement.logic.api.to.TestscasesSearchCriteriaTo;

import io.oasp.module.jpa.common.api.to.PaginatedListTo;
import io.oasp.module.jpa.common.api.to.PaginationResultTo;

/**
 * Implementation of component interface of testscasesmanagement
 */
@Named
@Transactional
public class TestscasesmanagementImpl extends AbstractComponentFacade implements Testscasesmanagement {

	/**
	 * Logger instance.
	 */
	private static final Logger LOG = LoggerFactory.getLogger(TestscasesmanagementImpl.class);

	/**
	 * @see #getTestscasesDao()
	 */
	@Inject
	private TestscasesDao testscasesDao;

	/**
	 * The constructor.
	 */
	public TestscasesmanagementImpl() {

		super();
	}

	@Override
	public TestscasesEto findTestscases(Long id) {
		LOG.debug("Get Testscases with id {} from database.", id);
		return getBeanMapper().map(getTestscasesDao().findOne(id), TestscasesEto.class);
	}

	@Override
	public PaginatedListTo<TestscasesEto> findTestscasesEtos(TestscasesSearchCriteriaTo criteria) {
		criteria.limitMaximumPageSize(MAXIMUM_HIT_LIMIT);
		PaginatedListTo<TestscasesEntity> testscasess = getTestscasesDao().findTestscasess(criteria);
		return mapPaginatedEntityList(testscasess, TestscasesEto.class);
	}

	@Override
	public boolean deleteTestscases(Long testscasesId) {
		TestscasesEntity testscases = getTestscasesDao().find(testscasesId);
		getTestscasesDao().delete(testscases);
		LOG.debug("The testscases with id '{}' has been deleted.", testscasesId);
		return true;
	}

	@Override
	public TestscasesEto saveTestscases(TestscasesEto testscases) {
		Objects.requireNonNull(testscases, "testscases");
		TestscasesEntity testscasesEntity = getBeanMapper().map(testscases, TestscasesEntity.class);

		// initialize, validate testscasesEntity here if necessary
		TestscasesEntity resultEntity = getTestscasesDao().save(testscasesEntity);
		LOG.debug("Testscases with id '{}' has been created.", resultEntity.getId());

		return getBeanMapper().map(resultEntity, TestscasesEto.class);
	}

	/**
	 * Returns the field 'testscasesDao'.
	 *
	 * @return the {@link TestscasesDao} instance.
	 */
	public TestscasesDao getTestscasesDao() {

		return this.testscasesDao;
	}

	@Override
	public TestscasesCto findTestscasesCto(Long id) {
		LOG.debug("Get TestscasesCto with id {} from database.", id);
		TestscasesEntity entity = getTestscasesDao().findOne(id);
		TestscasesCto cto = new TestscasesCto();
		cto.setTestscases(getBeanMapper().map(entity, TestscasesEto.class));

		return cto;
	}

	@Override
	public PaginatedListTo<TestscasesCto> findTestscasesCtos(TestscasesSearchCriteriaTo criteria) {
		criteria.limitMaximumPageSize(MAXIMUM_HIT_LIMIT);
		PaginatedListTo<TestscasesEntity> testscasess = getTestscasesDao().findTestscasess(criteria);
		List<TestscasesCto> ctos = new ArrayList<>();
		for (TestscasesEntity entity : testscasess.getResult()) {
			TestscasesCto cto = new TestscasesCto();
			cto.setTestscases(getBeanMapper().map(entity, TestscasesEto.class));
			ctos.add(cto);

		}
		PaginationResultTo pagResultTo = new PaginationResultTo(criteria.getPagination(), (long) ctos.size());
		PaginatedListTo<TestscasesCto> pagListTo = new PaginatedListTo(ctos, pagResultTo);
		return pagListTo;
	}

}
