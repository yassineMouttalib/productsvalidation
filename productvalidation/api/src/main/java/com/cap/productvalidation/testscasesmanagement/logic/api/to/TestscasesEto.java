package com.cap.productvalidation.testscasesmanagement.logic.api.to;

import com.cap.productvalidation.testscasesmanagement.common.api.Testscases;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of Testscases
 */
public class TestscasesEto extends AbstractEto implements Testscases {

	private static final long serialVersionUID = 1L;

	private String name;
	private String description;

	private Long productvalidationId;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public Long getProductvalidationId() {
		return productvalidationId;
	}

	@Override
	public void setProductvalidationId(Long productvalidationId) {
		this.productvalidationId = productvalidationId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());

		result = prime * result + ((this.productvalidationId == null) ? 0 : this.productvalidationId.hashCode());
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
		TestscasesEto other = (TestscasesEto) obj;
		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!this.name.equals(other.name)) {
			return false;
		}
		if (this.description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!this.description.equals(other.description)) {
			return false;
		}

		if (this.productvalidationId == null) {
			if (other.productvalidationId != null) {
				return false;
			}
		} else if (!this.productvalidationId.equals(other.productvalidationId)) {
			return false;
		}
		return true;
	}
}
