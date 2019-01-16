package com.cap.productsvalidation.testscasesmanagement.dataaccess.impl.dao;

import java.util.List;

import javax.inject.Named;

import com.cap.productsvalidation.general.dataaccess.base.dao.ApplicationDaoImpl;
import com.cap.productsvalidation.testscasesmanagement.dataaccess.api.TestscasesEntity;
import com.cap.productsvalidation.testscasesmanagement.dataaccess.api.dao.TestscasesDao;
import com.cap.productsvalidation.testscasesmanagement.logic.api.to.TestscasesSearchCriteriaTo;
import com.mysema.query.alias.Alias;
import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.path.EntityPathBase;

import io.oasp.module.jpa.common.api.to.OrderByTo;
import io.oasp.module.jpa.common.api.to.OrderDirection;
import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * This is the implementation of {@link TestscasesDao}.
 */
@Named
public class TestscasesDaoImpl extends ApplicationDaoImpl<TestscasesEntity> implements TestscasesDao {

	/**
	 * The constructor.
	 */
	public TestscasesDaoImpl() {

		super();
	}

	@Override
	public Class<TestscasesEntity> getEntityClass() {
		return TestscasesEntity.class;
	}

	@Override
	public PaginatedListTo<TestscasesEntity> findTestscasess(TestscasesSearchCriteriaTo criteria) {

		TestscasesEntity testscases = Alias.alias(TestscasesEntity.class);
		EntityPathBase<TestscasesEntity> alias = Alias.$(testscases);
		JPAQuery query = new JPAQuery(getEntityManager()).from(alias);

		Long id = criteria.getId();
		if (id != null) {
			query.where(Alias.$(testscases.getId()).eq(id));
		}
		String name = criteria.getName();
		if (name != null) {
			query.where(Alias.$(testscases.getName()).eq(name));
		}
		String description = criteria.getDescription();
		if (description != null) {
			query.where(Alias.$(testscases.getDescription()).eq(description));
		}
		addOrderBy(query, alias, testscases, criteria.getSort());

		return findPaginated(criteria, query, alias);
	}

	private void addOrderBy(JPAQuery query, EntityPathBase<TestscasesEntity> alias, TestscasesEntity testscases,
			List<OrderByTo> sort) {
		if (sort != null && !sort.isEmpty()) {
			for (OrderByTo orderEntry : sort) {
				switch (orderEntry.getName()) {
				case "id":
					if (OrderDirection.ASC.equals(orderEntry.getDirection())) {
						query.orderBy(Alias.$(testscases.getId()).asc());
					} else {
						query.orderBy(Alias.$(testscases.getId()).desc());
					}
					break;
				case "name":
					if (OrderDirection.ASC.equals(orderEntry.getDirection())) {
						query.orderBy(Alias.$(testscases.getName()).asc());
					} else {
						query.orderBy(Alias.$(testscases.getName()).desc());
					}
					break;
				case "description":
					if (OrderDirection.ASC.equals(orderEntry.getDirection())) {
						query.orderBy(Alias.$(testscases.getDescription()).asc());
					} else {
						query.orderBy(Alias.$(testscases.getDescription()).desc());
					}
					break;
				}
			}
		}
	}

}
