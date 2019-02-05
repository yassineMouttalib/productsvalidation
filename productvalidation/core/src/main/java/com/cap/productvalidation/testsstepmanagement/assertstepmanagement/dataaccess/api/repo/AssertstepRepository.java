package com.cap.productvalidation.testsstepmanagement.assertstepmanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.cap.productvalidation.testsstepmanagement.assertstepmanagement.dataaccess.api.AssertstepEntity;
import com.cap.productvalidation.testsstepmanagement.assertstepmanagement.logic.api.to.AssertstepSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link AssertstepEntity}
 */
public interface AssertstepRepository extends DefaultRepository<AssertstepEntity> {

	/**
	 * @param criteria    the {@link AssertstepSearchCriteriaTo} with the criteria
	 *                    to search.
	 * @param pageRequest {@link Pageable} implementation used to set page
	 *                    properties like page size
	 * @return the {@link Page} of the {@link AssertstepEntity} objects that matched
	 *         the search.
	 */
	default Page<AssertstepEntity> findByCriteria(AssertstepSearchCriteriaTo criteria) {

		AssertstepEntity alias = newDslAlias();
		JPAQuery<AssertstepEntity> query = newDslQuery(alias);

		String type = criteria.getType();
		if (type != null && !type.isEmpty()) {
			QueryUtil.get().whereString(query, $(alias.getType()), type, criteria.getTypeOption());
		}
		addOrderBy(query, alias, criteria.getPageable().getSort());

		return QueryUtil.get().findPaginated(criteria.getPageable(), query, true);
	}

	/**
	 * Add sorting to the given query on the given alias
	 * 
	 * @param query to add sorting to
	 * @param alias to retrieve columns from for sorting
	 * @param sort  specification of sorting
	 */
	public default void addOrderBy(JPAQuery<AssertstepEntity> query, AssertstepEntity alias, Sort sort) {
		if (sort != null && sort.isSorted()) {
			Iterator<Order> it = sort.iterator();
			while (it.hasNext()) {
				Order next = it.next();
				switch (next.getProperty()) {
				case "type":
					if (next.isAscending()) {
						query.orderBy($(alias.getType()).asc());
					} else {
						query.orderBy($(alias.getType()).desc());
					}
					break;
				default:
					throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
				}
			}
		}
	}

}