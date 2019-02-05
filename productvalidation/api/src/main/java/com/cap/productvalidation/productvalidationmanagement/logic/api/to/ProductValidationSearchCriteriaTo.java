package com.cap.productvalidation.productvalidationmanagement.logic.api.to;

import com.cap.productvalidation.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.cap.productvalidation.productvalidationmanagement.common.api.ProductValidation}s.
 */
public class ProductValidationSearchCriteriaTo extends AbstractSearchCriteriaTo {

	private static final long serialVersionUID = 1L;

	private String name;
	private String version;

	private StringSearchConfigTo nameOption;
	private StringSearchConfigTo versionOption;

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
	 * @return versionId
	 */

	public String getVersion() {
		return version;
	}

	/**
	 * @param version setter for version attribute
	 */

	public void setVersion(String version) {
		this.version = version;
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
	 *         {@link #getVersion() version}.
	 */
	public StringSearchConfigTo getVersionOption() {

		return this.versionOption;
	}

	/**
	 * @param versionOption new value of {@link #getVersionOption()}.
	 */
	public void setVersionOption(StringSearchConfigTo versionOption) {

		this.versionOption = versionOption;
	}

}