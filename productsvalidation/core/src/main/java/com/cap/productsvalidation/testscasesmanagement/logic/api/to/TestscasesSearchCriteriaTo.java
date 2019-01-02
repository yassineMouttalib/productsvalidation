package com.cap.productsvalidation.testscasesmanagement.logic.api.to;

import io.oasp.module.jpa.common.api.to.SearchCriteriaTo;

/**
 * This is the {@link SearchCriteriaTo search criteria}
 * {@link net.sf.mmm.util.transferobject.api.TransferObject TO} used to find
 * {@link com.cap.productsvalidation.testscasesmanagement.common.api.Testscases}s.
 */
public class TestscasesSearchCriteriaTo extends SearchCriteriaTo {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;

	private String description;

	/**
	 * The constructor.
	 */
	public TestscasesSearchCriteriaTo() {

		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
