package com.cap.productsvalidation.productvalidationmanagement.common.api;

import com.cap.productsvalidation.general.common.api.ApplicationEntity;

public interface ProductValidation extends ApplicationEntity {

	public String getName();

	public void setName(String name);

	public String getVersion();

	public void setVersion(String version);

}