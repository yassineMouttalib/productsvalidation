package com.cap.productvalidation.testsstepmanagement.reststepmanagement.common.api;

import com.cap.productvalidation.general.common.api.ApplicationEntity;

public interface Reststep extends ApplicationEntity {

	/**
	 * @return urlId
	 */

	public String getUrl();

	/**
	 * @param url setter for url attribute
	 */

	public void setUrl(String url);

}
