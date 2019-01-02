package com.cap.productsvalidation.productvalidationmanagement.dataaccess.api;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.cap.productsvalidation.general.dataaccess.api.ApplicationPersistenceEntity;
import com.cap.productsvalidation.productvalidationmanagement.common.api.ProductValidation;
import com.cap.productsvalidation.testscasesmanagement.dataaccess.api.TestscasesEntity;
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
