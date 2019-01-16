package com.cap.productsvalidation.productvalidationmanagement.logic.api.to;

import java.util.List;

import com.cap.productsvalidation.testscasesmanagement.dataaccess.api.TestscasesEntity;

import io.oasp.module.jpa.common.api.to.SearchCriteriaTo;

/**
 * This is the {@link SearchCriteriaTo search criteria}
 * {@link net.sf.mmm.util.transferobject.api.TransferObject TO} used to find
 * {@link com.cap.productsvalidation.productvalidationmanagement.common.api.ProductValidation}s.
 *
 */
public class ProductValidationSearchCriteriaTo extends SearchCriteriaTo {

	private static final long serialVersionUID = 1L;

	private String name;
	private String version;
	private List<TestscasesEntity> testscases;
	/**
	 * The constructor.
	 */
	public ProductValidationSearchCriteriaTo() {

		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public List<TestscasesEntity> getTestscases() {
		return testscases;
	}

	public void setTestscases(List<TestscasesEntity> testscases) {
		this.testscases = testscases;
	}

}
