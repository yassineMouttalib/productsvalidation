package com.cap.productvalidation.testsstepmanagement.assertstepmanagement.logic.api.to;

import com.cap.productvalidation.testsstepmanagement.assertstepmanagement.common.api.Assertstep;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of Assertstep
 */
public class AssertstepEto extends AbstractEto implements Assertstep {

	private static final long serialVersionUID = 1L;

	private String type;

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
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
		AssertstepEto other = (AssertstepEto) obj;
		if (this.type == null) {
			if (other.type != null) {
				return false;
			}
		} else if (!this.type.equals(other.type)) {
			return false;
		}
		return true;
	}
}