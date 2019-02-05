package com.cap.productvalidation.productvalidationmanagement.common.api;

import com.cap.productvalidation.general.common.api.ApplicationEntity;

public interface ProductValidation extends ApplicationEntity {

	/**
	 * @return nameId
	 */

	public String getName();

	/**
	 * @param name setter for name attribute
	 */

	public void setName(String name);

	/**
	 * @return versionId
	 */

	public String getVersion();

	/**
	 * @param version setter for version attribute
	 */

	public void setVersion(String version);

}
