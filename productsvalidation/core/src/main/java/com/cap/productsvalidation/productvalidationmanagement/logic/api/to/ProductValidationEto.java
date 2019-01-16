package com.cap.productsvalidation.productvalidationmanagement.logic.api.to;

import java.util.List;

import com.cap.productsvalidation.general.common.api.to.AbstractEto;
import com.cap.productsvalidation.productvalidationmanagement.common.api.ProductValidation;
import com.cap.productsvalidation.testscasesmanagement.dataaccess.api.TestscasesEntity;

/**
 * Entity transport object of ProductValidation
 */
public class ProductValidationEto extends AbstractEto implements ProductValidation {

	private static final long serialVersionUID = 1L;

	private String name;
	private String version;
	private List<TestscasesEntity> testscases;
	public List<TestscasesEntity> getTestscases() {
		return testscases;
	}

	public void setTestscases(List<TestscasesEntity> testscases) {
		this.testscases = testscases;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getVersion() {
		return version;
	}

	@Override
	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		result = prime * result + ((this.version == null) ? 0 : this.version.hashCode());

		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		// class check will be done by super type EntityTo!
		if (!super.equals(obj)) {
			return false;
		}
		ProductValidationEto other = (ProductValidationEto) obj;
		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!this.name.equals(other.name)) {
			return false;
		}
		if (this.version == null) {
			if (other.version != null) {
				return false;
			}
		} else if (!this.version.equals(other.version)) {
			return false;
		}

		return true;
	}
}