package com.cap.productvalidation.productvalidationmanagement.dataaccess.api;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.cap.productvalidation.general.dataaccess.api.ApplicationPersistenceEntity;
import com.cap.productvalidation.productvalidationmanagement.common.api.ProductValidation;
import com.cap.productvalidation.testscasesmanagement.dataaccess.api.TestscasesEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "ProductValidation")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductValidationEntity extends ApplicationPersistenceEntity implements ProductValidation {

	private String name;

	private String version;

	private List<TestscasesEntity> testscases;

	private static final long serialVersionUID = 1L;

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

	@OneToMany(mappedBy = "productvalidation")
	public List<TestscasesEntity> getTestscases() {
		return testscases;
	}

	public void setTestscases(List<TestscasesEntity> testscases) {
		this.testscases = testscases;
	}

}
