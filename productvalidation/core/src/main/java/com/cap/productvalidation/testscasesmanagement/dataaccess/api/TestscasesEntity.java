package com.cap.productvalidation.testscasesmanagement.dataaccess.api;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.cap.productvalidation.general.dataaccess.api.ApplicationPersistenceEntity;
import com.cap.productvalidation.productvalidationmanagement.dataaccess.api.ProductValidationEntity;
import com.cap.productvalidation.testscasesmanagement.common.api.Testscases;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Testscases")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestscasesEntity extends ApplicationPersistenceEntity implements Testscases {

	private String name;

	private String description;

	private ProductValidationEntity productvalidation;

	private static final long serialVersionUID = 1L;

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

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "ProductValidationID")
	public ProductValidationEntity getProductvalidation() {
		return productvalidation;
	}

	public void setProductvalidation(ProductValidationEntity productvalidation) {
		this.productvalidation = productvalidation;
	}

	@Override
	@Transient
	public Long getProductvalidationId() {

		if (this.productvalidation == null) {
			return null;
		}
		return this.productvalidation.getId();
	}

	@Override
	public void setProductvalidationId(Long productvalidationId) {

		if (productvalidationId == null) {
			this.productvalidation = null;
		} else {
			ProductValidationEntity productValidationEntity = new ProductValidationEntity();
			productValidationEntity.setId(productvalidationId);
			this.productvalidation = productValidationEntity;
		}
	}

}
