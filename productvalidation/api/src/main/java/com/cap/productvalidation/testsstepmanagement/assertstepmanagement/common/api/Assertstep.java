package com.cap.productvalidation.testsstepmanagement.assertstepmanagement.common.api;

import com.cap.productvalidation.general.common.api.ApplicationEntity;

public interface Assertstep extends ApplicationEntity {

	/**
	 * @return typeId
	 */

	public String getType();

	/**
	 * @param type setter for type attribute
	 */

	public void setType(String type);

}