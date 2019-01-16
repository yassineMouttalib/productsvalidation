package com.cap.productsvalidation.testscasesmanagement.common.api;

import com.cap.productsvalidation.general.common.api.ApplicationEntity;

public interface Testscases extends ApplicationEntity {

	public Long getId();

	public void setId(Long id);

	public String getName();

	public void setName(String name);

	public String getDescription();

	public void setDescription(String description);

}
