package com.cap.productvalidation.testscasesmanagement.common.api;

import com.cap.productvalidation.general.common.api.ApplicationEntity;

public interface Testscases extends ApplicationEntity {

	/**
	 * @return nameId
	 */

	public String getName();

	/**
	 * @param name setter for name attribute
	 */

	public void setName(String name);

	/**
	 * @return descriptionId
	 */

	public String getDescription();

	/**
	 * @param description setter for description attribute
	 */

	public void setDescription(String description);

	/**
	 * getter for productvalidationId attribute
	 * 
	 * @return productvalidationId
	 */

	public Long getProductvalidationId();

	/**
	 * @param productvalidation setter for productvalidation attribute
	 */

	public void setProductvalidationId(Long productvalidationId);

}
