package com.cap.productvalidation.testsstepmanagement.assertstepmanagement.logic.api.to;

import com.cap.productvalidation.testsstepmanagement.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.cap.productvalidation.testsstepmanagement.assertstepmanagement.common.api.Assertstep}s.
 */
public class AssertstepSearchCriteriaTo extends AbstractSearchCriteriaTo {

	private static final long serialVersionUID = 1L;

	private String type;
	private StringSearchConfigTo typeOption;

	/**
	 * @return typeId
	 */

	public String getType() {
		return type;
	}

	/**
	 * @param type setter for type attribute
	 */

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the {@link StringSearchConfigTo} used to search for {@link #getType()
	 *         type}.
	 */
	public StringSearchConfigTo getTypeOption() {

		return this.typeOption;
	}

	/**
	 * @param typeOption new value of {@link #getTypeOption()}.
	 */
	public void setTypeOption(StringSearchConfigTo typeOption) {

		this.typeOption = typeOption;
	}

}