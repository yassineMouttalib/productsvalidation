package com.cap.productvalidation.testscasesmanagement.logic.api.to;

import com.cap.productvalidation.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.cap.productvalidation.testscasesmanagement.common.api.Testscases}s.
 */
public class TestscasesSearchCriteriaTo extends AbstractSearchCriteriaTo {

	private static final long serialVersionUID = 1L;

	private String name;
	private String description;

	private Long productvalidationId;
	private StringSearchConfigTo nameOption;
	private StringSearchConfigTo descriptionOption;

	/**
	 * @return nameId
	 */

	public String getName() {
		return name;
	}

	/**
	 * @param name setter for name attribute
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return descriptionId
	 */

	public String getDescription() {
		return description;
	}

	/**
	 * @param description setter for description attribute
	 */

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * getter for productvalidationId attribute
	 * 
	 * @return productvalidationId
	 */

	public Long getProductvalidationId() {
		return productvalidationId;
	}

	/**
	 * @param productvalidation setter for productvalidation attribute
	 */

	public void setProductvalidationId(Long productvalidationId) {
		this.productvalidationId = productvalidationId;
	}

	/**
	 * @return the {@link StringSearchConfigTo} used to search for {@link #getName()
	 *         name}.
	 */
	public StringSearchConfigTo getNameOption() {

		return this.nameOption;
	}

	/**
	 * @param nameOption new value of {@link #getNameOption()}.
	 */
	public void setNameOption(StringSearchConfigTo nameOption) {

		this.nameOption = nameOption;
	}

	/**
	 * @return the {@link StringSearchConfigTo} used to search for
	 *         {@link #getDescription() description}.
	 */
	public StringSearchConfigTo getDescriptionOption() {

		return this.descriptionOption;
	}

	/**
	 * @param descriptionOption new value of {@link #getDescriptionOption()}.
	 */
	public void setDescriptionOption(StringSearchConfigTo descriptionOption) {

		this.descriptionOption = descriptionOption;
	}

}
